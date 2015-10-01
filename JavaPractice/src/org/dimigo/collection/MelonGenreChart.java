package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
// 자동임포트 = ctrl + shift + O
public class MelonGenreChart {
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		List<Music> ballad = new ArrayList<Music>();
		ballad.add(new Music("내 첫사랑", "베리 굿"));
		ballad.add(new Music("또 다시 사랑", "임창정"));
		ballad.add(new Music("부산에 가면", "박진영"));
		List<Music> dance = new ArrayList<Music>();
		dance.add(new Music("커피", "유재환,김예림"));
		dance.add(new Music("다잘될거야", "쿨"));
		map.put("발라드", ballad);
		map.put("댄스", dance);
		
		System.out.println("------ << 멜론 장르별 차트 >> ------");
		printMap(map);

		System.out.println("------ << 발라드 3위곡 변경 >> ------");
		ballad.set(2, new Music("지우고 지워도", "차수경"));
		printMap(map);
		System.out.println("------ << 발라드 1위곡 삭제 >> ------");
		ballad.remove(0);
		printMap(map);
		System.out.println("------ << 전체 리스트 삭제 >> ------");
		map.clear();
		printMap(map);
		
		
	}
	public static void printMap(Map<String, List<Music>> map) {
		int i = 1;
		for(Entry<String, List<Music>> entry : map.entrySet()) {
			System.out.println("[" + entry.getKey() + "]");
			List<Music> list = entry.getValue();
			for(Music music : list) {
				System.out.println(i + ". " + music);
				i++;
			}
			i=1;
		}
		System.out.println();
	}
}
