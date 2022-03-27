package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTv implements TV {

	@Autowired
	private Speaker speaker;

	public LgTv() {
		System.out.println("===> LgTV ��ü ����");
	}

	public void powerOn() {
		System.out.println("LgTv --- ���� �Ҵ�");
	}

	public void powerOff() {
		System.out.println("LgTv --- ���� ����");
	}

	public void volumeUp() {
//		System.out.println("LgTv --- �Ҹ� �︰��");
		speaker.volumeUp();
	}

	public void volumeDown() {
//		System.out.println("LgTv --- �Ҹ� ������");
		speaker.volumeUp();
	}
}
