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
		setTitle("üũ�ڽ�");
		setLocation(500,500);
		setSize(400,400);
		
		Panel p = new Panel();
		
		Checkbox cb1 = new Checkbox("��");
		Checkbox cb2 = new Checkbox("�౸");
		Checkbox cb3 = new Checkbox("�߱�");
		Checkbox cb4 = new Checkbox("������");
		
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		
		//���� ��ư �����
		CheckboxGroup group = new CheckboxGroup();
		
		Checkbox man = new Checkbox("����", group, true);
		Checkbox woman = new Checkbox("����", group, false);
		
		p.add(man);
		p.add(woman);
		
		Choice ch = new Choice();
		ch.add("ȣ");
		ch.add("��");
		ch.add("��");
		ch.add("��");
		ch.add("��");
		p.add(ch);
		
		//5���� �����ְ� �������� ������ �� �ֵ��� ���ִ� List false �� �Ѱ�
		List list = new List(5,true);
		list.add("���̾�");
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
		// list�� remove(int idx)�� �̿��ϸ� idx ��°�� ����� �ֽ��ϴ�.
		//list.remove(0);
		//ù��° �ִ� ���̾ƿ� 5��° �ִ� jordan�� ��������
		// �������� ���� ���� �ڿ��� ���� ���� �ؾ��մϴ�.
		// �ڿ������� ���� �տ����� ������ �ȹޱ� ������ �ڿ��� ���� ����.
		list.remove(4);
		list.remove(0);
		
		
		add(p);
		setVisible(true);
	}
}
