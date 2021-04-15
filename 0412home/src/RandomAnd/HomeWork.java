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
			System.out.print("업로드 하시겠습니까? (예,아니오)");
			String answer = scanner.next();
			if(answer.equals("예")) {
				int place = extensName[rdNum].lastIndexOf(".")+1;
				String exten = extensName[rdNum].substring(place);
				int sw=0;
				for(int i=0;i<uploadAble.length;i++) {
					if(uploadAble[i].equals(exten)) {
						System.out.println("입력된 "+extensName[rdNum]+"파일은 업로드가 가능합니다.");
						sw=1;
					}
				}
				if(sw==0) {
					System.out.println("입력된 "+extensName[rdNum]+"파일은 업로드가 불가능합니다.");
				}
			}
			else if(answer.equals("아니오")) {
				System.out.println("이용해주셔서 감사합니다.");
				break;
			}
			else System.out.println("다시 입력해주세요.");
		}
		scanner.close();
	}
}
