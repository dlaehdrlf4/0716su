package frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

import javafx.scene.control.CheckBox;

public class Compo extends Frame {
	public Compo() {
		setTitle("체크박스");
		setLocation(500,500);
		setSize(400,400);
		
		Panel p = new Panel();
		
		Checkbox cb1 = new Checkbox("농구");
		Checkbox cb2 = new Checkbox("축구");
		Checkbox cb3 = new Checkbox("야구");
		Checkbox cb4 = new Checkbox("배드민턴");
		
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		
		//라디오 버튼 만들기
		CheckboxGroup group = new CheckboxGroup();
		
		Checkbox man = new Checkbox("남자", group, true);
		Checkbox woman = new Checkbox("여자", group, false);
		
		p.add(man);
		p.add(woman);
		
		Choice ch = new Choice();
		ch.add("호");
		ch.add("우");
		ch.add("주");
		ch.add("의");
		ch.add("보");
		p.add(ch);
		
		//5개를 보여주고 여러개를 선택할 수 있도록 해주는 List false 면 한개
		List list = new List(5,true);
		list.add("파이아");
		list.add("dong");
		list.add("james");
		list.add("cobe");
		list.add("jordan");
		list.add("curry");
		list.add("howord");
		list.add("god");
		list.add("green");
		list.add("poul");
		list.add("hardon");
		p.add(list);
		// list의 remove(int idx)를 이용하면 idx 번째를 지울수 있습니다.
		//list.remove(0);
		//첫번째 있는 파이아와 5번째 있는 jordan을 지워보자
		// 여러개를 지울 때는 뒤에서 부터 삭제 해야합니다.
		// 뒤에서부터 빼면 앞에꺼에 영향을 안받기 때문에 뒤에서 부터 뺀다.
		list.remove(4);
		list.remove(0);
		
		
		add(p);
		setVisible(true);
	}
}
