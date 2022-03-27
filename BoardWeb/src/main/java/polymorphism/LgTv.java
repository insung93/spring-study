package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTv implements TV {

	@Autowired
	private Speaker speaker;

	public LgTv() {
		System.out.println("===> LgTV 객체 생성");
	}

	public void powerOn() {
		System.out.println("LgTv --- 전원 켠다");
	}

	public void powerOff() {
		System.out.println("LgTv --- 전원 끈다");
	}

	public void volumeUp() {
//		System.out.println("LgTv --- 소리 울린다");
		speaker.volumeUp();
	}

	public void volumeDown() {
//		System.out.println("LgTv --- 소리 내린다");
		speaker.volumeUp();
	}
}
