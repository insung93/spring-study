package polymorphism;

public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("applespeaker ��ü ����");
	}
	public void volumeUp() {
		System.out.println("AppleSpeaker--- �Ҹ� �︰��");
	}
	public void volumeDown() {
		System.out.println("AppleSpeaker--- �Ҹ� ������");
	}
}
