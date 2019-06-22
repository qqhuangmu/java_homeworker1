package world;

import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.util.Map.Entry;

import javax.crypto.SecretKey;

public class Worlder {
	public static void main(String[] args) {
		Map<String, WorldCup> map = new TreeMap();
		Map<String, WorldCup> map2 = map;
		map2.put("1930", new WorldCup("第一届", "1930年", "乌拉圭", "乌拉圭"));
		map2.put("1934", new WorldCup("第二届", "1934年", "意大利", "意大利"));
		map2.put("1938", new WorldCup("第三届", "1938年", "法国", "意大利"));
		map2.put("1950", new WorldCup("第四届", "1950年", "巴西", "乌拉圭"));
		map2.put("1954", new WorldCup("第五届", "1954年", "瑞士", "西德"));
		map2.put("1958", new WorldCup("第六届", "1958年", "瑞典", "巴西"));
		map2.put("1962", new WorldCup("第七届", "1962年", "智利", "巴西"));
		map2.put("1966", new WorldCup("第八届", "1966年", "英格兰", "英格兰"));
		map2.put("1970", new WorldCup("第九届", "1970年", "墨西哥", "巴西"));
		map2.put("1974", new WorldCup("第十届", "1974年", "前西德", "西德"));
		map2.put("1978", new WorldCup("第十一届", "1978年", "阿根廷", "阿根廷"));
		map2.put("1982", new WorldCup("第十二届", "1982年", "西班牙", "意大利"));
		map2.put("1986", new WorldCup("第十三届", "1986年", "墨西哥", "阿根廷"));
		map2.put("1990", new WorldCup("第十四届", "1990年", "意大利", "西德"));
		map2.put("1994", new WorldCup("第十五届", "1994年", "美国", "巴西"));
		map2.put("1998", new WorldCup("第十六届", "1998年", "法国", "法国"));
		map2.put("2002", new WorldCup("第十七届", "2002年", "韩日", "巴西"));
		map2.put("2006", new WorldCup("第十八届", "2006年", "德国", "意大利"));
		map2.put("2010", new WorldCup("第十九届", "2010年", "南非", "西班牙"));
		map2.put("2014", new WorldCup("第二十届", "2014年", "巴西", "德国"));

		Set<Entry<String, WorldCup>> entry = map2.entrySet();
		System.out.println("历届世界杯详情：");
		for (Entry<String, WorldCup> entry2 : entry) {
			String key = entry2.getKey();
			WorldCup value = entry2.getValue();
			System.out.println(
					value.getNumber() + '\t' + value.getYears() + '\t' + value.getSite() + '\t' + value.getChampion());
		}
		Scanner input = new Scanner(System.in);
		System.out.println("请输入需查询的年份：");
		String year = input.next();
		// 根据年份查询信息
		if (map.containsKey(year)) {
			WorldCup y = map.get(year);
			System.out.println("年份\t" + '\t' + "届数\t" + '\t' + "举办地点\t" + '\t' + "冠军得主");
			System.out.println(y.getYears() + '\t' + '\t' + y.getNumber() + '\t' + '\t' + y.getSite() + '\t' + '\t'
					+ y.getChampion());

		} else {
			System.out.println("该年没有举办世界杯");
		}
		// 根据国家查询信息
		System.out.println("请输入需要查询的国家：");
		String country = input.next();
		Set<Entry<String, WorldCup>> Set = map.entrySet();
		for (Entry<String, WorldCup> entry2 : Set) {
			if (entry2.getValue().getChampion().equals(country)) {
				System.out.println(entry2.getKey());
			}
		}

	}
}
