package RandomAnd;
import java.util.Scanner;
public class HomeWork {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] extensName = {"a.$$$","b.ac3","c.ai","d.bak","e.bin","f.bmp","g.c"
				,"h.cls","i.cmd","j.dwg","k.exe","l.gif","m.hml","n.img","o.jpg",
				"p.ibm","q.mp3","r.sav","s.png","t.xlsx","u.zip","v.xcf","w.2bp","x.jpe",
				"y.jpeg","z.java",};
		String[] uploadAble = {"jpg","gif","png","xlsx","zip"};
		while(true) {
			int rdNum = (int) (Math.random()*25+1);
			System.out.print("���ε� �Ͻðڽ��ϱ�? (��,�ƴϿ�)");
			String answer = scanner.next();
			if(answer.equals("��")) {
				int place = extensName[rdNum].lastIndexOf(".")+1;
				String exten = extensName[rdNum].substring(place);
				int sw=0;
				for(int i=0;i<uploadAble.length;i++) {
					if(uploadAble[i].equals(exten)) {
						System.out.println("�Էµ� "+extensName[rdNum]+"������ ���ε尡 �����մϴ�.");
						sw=1;
					}
				}
				if(sw==0) {
					System.out.println("�Էµ� "+extensName[rdNum]+"������ ���ε尡 �Ұ����մϴ�.");
				}
			}
			else if(answer.equals("�ƴϿ�")) {
				System.out.println("�̿����ּż� �����մϴ�.");
				break;
			}
			else System.out.println("�ٽ� �Է����ּ���.");
		}
		scanner.close();
	}
}
