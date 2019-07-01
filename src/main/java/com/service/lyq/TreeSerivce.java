package com.service.lyq;

import com.dao.lyq.PermisstabDAO;
import com.entity.lyq.EasyuiNood;
import com.entity.lyq.Permisstab1;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TreeSerivce {

	@Resource
    PermisstabDAO ng;

	public List<EasyuiNood> getTree() {
		List<Permisstab1> list = ng.queryAll();
		System.out.println("-------------------");
		System.out.println(list);
		return transfer(list);
	}

	private List<EasyuiNood> transfer(List<Permisstab1> list) {
		List<EasyuiNood> treeNoods = new ArrayList<EasyuiNood>();
		// 封装每一行数据为节点EasyuiNood
		for (Permisstab1 n : list) {
			EasyuiNood nood = new EasyuiNood();

			nood.setId(n.getPerId());
			nood.setText(n.getPerTitle());
			nood.setIconCls(n.getIcon());

			// stats,有子节点closed,没有子节点open
			//List<Permisstab1> childs = n.getChildren();
			List<Permisstab1> childs=ng.queryByperLevel(n.getPerId());

			// attributes
			Map<String, Object> map = new HashMap<String, Object>();
			if (childs.size() > 0) {
				// 有子节点
				// nood.setState("closed");
				nood.setState("open");

				// children
				nood.setChildren(transfer(childs));
			} else {
				// 没有子节点
				nood.setState("open");


				map.put("url", n.getUrl());

			}
			map.put("operaId",n.getOperaId());
			map.put("operaDate",n.getOperaDate());
			nood.setAttributes(map);

			treeNoods.add(nood);
		}
		return treeNoods;
	}

	public List<EasyuiNood> getTreeByRid(Integer rid) {
		List<Permisstab1> list = ng.queryByRid(rid);
		String rids = ng.queryRids(rid);
		return transferByRid(list, rids);
	}

	private List<EasyuiNood> transferByRid(List<Permisstab1> list, String rids) {
		List<EasyuiNood> treeNoods = new ArrayList<EasyuiNood>();
		// 封装每一行数据为节点EasyuiNood
		for (Permisstab1 n : list) {
			EasyuiNood nood = new EasyuiNood();

			nood.setId(n.getPerId());
			nood.setText(n.getPerTitle());
			nood.setIconCls(n.getIcon());

			// stats,有子节点closed,没有子节点open
			//List<Permisstab1> childs = n.getChildren();
			List<Permisstab1> childs =ng.queryByperLevel(n.getPerId());
			List<Permisstab1> child = new ArrayList<Permisstab1>();
			for (Permisstab1 n2 : childs) {
				if (rids.contains(String.valueOf(n2.getPerId()))) {
					child.add(n2);
				}
			}

			if (childs.size() > 0) {
				// 有子节点
				// nood.setState("closed");
				nood.setState("open");

				// children
				nood.setChildren(transferByRid(child, rids));
			} else {
				// 没有子节点
				nood.setState("open");

				// attributes
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("url", n.getUrl());
				nood.setAttributes(map);
			}
			treeNoods.add(nood);
		}
		return treeNoods;
	}
}
