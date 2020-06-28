package jest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class jest1 extends JFrame{ 
	
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	HashMap<String, String> link = new HashMap<String, String>();
	public JPanel Quiz = new JPanel();
	public String major = "";
	static JButton [] btn = new RoundButton[3];
	static Vector<String> str = new Vector<String>();
	int cur = 0;
	public jest1() {
		setTitle("jest");
		setSize(550,520);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setLocationRelativeTo(null);
		
		Quiz.setLayout(new FlowLayout());
		Quiz.setBackground(new Color(72, 106, 174));
		
		JLabel textLabel = new JLabel("제주대학교 학과 테스트");
		ImageIcon logo = new ImageIcon("images/로고투명.png");
		Image image = logo.getImage();
		Image logo2= image.getScaledInstance(80, 71, Image.SCALE_SMOOTH );
		logo = new ImageIcon(logo2);
		

		try{
	         //파일 객체 생성
	         File file = new File("./DB/학과.txt");
	         //입력 스트림 생성
	         FileReader filereader = new FileReader(file);
	         //입력 버퍼 생성
	         BufferedReader bufReader = new BufferedReader(filereader);
	         String line = "";
	         while((line = bufReader.readLine()) != null){
	        	 map.put(line,0);
	         }
	         //.readLine()은 끝에 개행문자를 읽지 않는다.            
	         bufReader.close();
	     }catch (FileNotFoundException e) {
	         // TODO: handle exception
	     }catch(IOException e){
	         System.out.println(e);
	     }
		
		
		//Dimension d = getSize();
		//g.drawImage(logo.getImage(), 50, 50, d.width, d.height, null);
		
		JLabel imageLabel = new JLabel(logo);
		textLabel.setFont(new Font("나눔고딕", Font.BOLD, 40));
		textLabel.setForeground(new Color(255,255,255));
		Quiz.add(imageLabel);
		Quiz.add(textLabel);
		
		btn[0] = new RoundButton("");
		btn[1] = new RoundButton("");
		btn[2] = new RoundButton("");

		
		btn[1].addMouseListener(new MyMouseAdapter());
		btn[2].addMouseListener(new MyMouseAdapter());
		
		btn[0].setBorderPainted(false);
		btn[0].setPreferredSize(new Dimension(400, 50));
		btn[0].setFocusable(false);
		btn[0].setBackground(new Color(106,132,183));
		btn[0].setForeground(new Color(255,255,255));
		btn[0].setFont(new Font("나눔고딕", Font.ITALIC|Font.BOLD, 30));
		Quiz.add(btn[0]);
		
			
		
		for(int i = 1; i < 3; i++) {
			//btn[i].setBorder(new LineBorder(new Color(196,222,255), 100, true));
			
			btn[i].setFocusPainted(false);
			btn[i].setBorderPainted(false);
			btn[i].setPreferredSize(new Dimension(400, 150));
			btn[i].setBackground(new Color(196,222,255));
			btn[i].setForeground(new Color(255,255,255));
			btn[i].setFont(new Font("나눔고딕", Font.BOLD, 30));
			btn[i].requestFocus();
			Quiz.add(btn[i]);
			
		}
		
		setContentPane(Quiz);
		setVisible(true);
	}
	
	private JButton RoundButton(Object str) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object str(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	class MyMouseAdapter extends MouseAdapter{
//
//		int[] departments = new int[75];
//		int[][] weight = new int[41][75]
//		
//		for(int q=0 ; q<41 ; q++) {
//			for(int d=0 ; d<75 ; d++) {
//				if(weight[q][i] = 1) {
//					departments++;
//				}
//			}
//		}
//		
		
		@Override
		public void mousePressed(MouseEvent e) {
			JButton Tempbtn = (JButton)e.getSource();
			Tempbtn.setBackground(new Color(255,255,255));
			
  			
  			
  			switch(cur) {
  			
  			case 0: // 1번 문제
  				if(Tempbtn == btn[1]) {
  					map.put("체육교육과",map.get("체육교육과")+1);
  					map.put("체육학과",map.get("체육학과")+1);
  				}
  				break;
 
  			case 1: // 2번 문제
  				if(Tempbtn == btn[1]) {
  					map.put("국어국문학과",map.get("국어국문학과")+1);
  					map.put("영어영문학과",map.get("영어영문학과")+1);
  					map.put("일어일문학과",map.get("일어일문학과")+1);
  					map.put("중어중문학과",map.get("중어중문학과")+1);
  					map.put("독일학과",map.get("독일학과")+1);
  					map.put("사학과",map.get("사학과")+1);
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("철학과",map.get("철학과")+1);
  					map.put("행정학과",map.get("행정학과")+1);
  					map.put("정치외교학과",map.get("정치외교학과")+1);
  					map.put("언론홍보학과",map.get("언론홍보학과")+1);
  					map.put("경영학과",map.get("경영학과")+1);
  					map.put("관광경영학과",map.get("관광경영학과")+1);
  					map.put("회계학과",map.get("회계학과")+1);
  					map.put("무역학과",map.get("무역학과")+1);
  					map.put("경제학과",map.get("경제학과")+1);
  					map.put("관광개발학과",map.get("관광개발학과")+1);
  					map.put("경영정보학과",map.get("경영정보학과")+1);
  					map.put("국어교육과",map.get("국어교육과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("지리교육과",map.get("지리교육과")+1);
  					map.put("아동생활복지전공",map.get("아동생활복지전공")+1);
  					map.put("주거가족복지전공",map.get("주거가족복지전공")+1);
  					map.put("패션의류학과",map.get("패션의류학과")+1);
  					map.put("체육학과",map.get("체육학과")+1);
  					map.put("초등교육과",map.get("초등교육과")+1);
  					map.put("음악학부",map.get("음악학부")+1);
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  					map.put("건강뷰티향장학과",map.get("건강뷰티향장학과")+1);
  					map.put("실버케어복지학과",map.get("실버케어복지학과")+1);
  					map.put("관광융복합학과",map.get("관광융복합학과")+1);
  					map.put("부동산관리학과",map.get("부동산관리학과")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("물리교육전공",map.get("물리교육전공")+1);
  					map.put("체육교육과",map.get("체육교육과")+1);
  					map.put("식물자원환경전공",map.get("식물자원환경전공")+1);
  					map.put("원예환경전공",map.get("원예환경전공")+1);
  					map.put("바이오소재전공",map.get("바이오소재전공")+1);
  					map.put("분자생명공학전공",map.get("분자생명공학전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("산업응용경제학과",map.get("산업응용경제학과")+1);
  					map.put("해양생명과학과",map.get("해양생명과학과")+1);
  					map.put("수산생명의학과",map.get("수산생명의학과")+1);
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  					map.put("지구해양과학과",map.get("지구해양과학과")+1);
  					map.put("환경공학과",map.get("환경공학과")+1);
  					map.put("토목공학과",map.get("토목공학과")+1);
  					map.put("해양시스템공학과",map.get("해양시스템공학과")+1);
  					map.put("물리학과",map.get("물리학과")+1);
  					map.put("생물학과",map.get("생물학과")+1);
  					map.put("화학코스메틱스학과",map.get("화학코스메틱스학과")+1);
  					map.put("식품영양학과",map.get("식품영양학과")+1);
  					map.put("수학과",map.get("수학과")+1);
  					map.put("전산통계학과",map.get("전산통계학과")+1);
  					map.put("식품생명공학과",map.get("식품생명공학과")+1);
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  					map.put("의예과",map.get("의예과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("간호학과",map.get("간호학과")+1);
  					map.put("약학과",map.get("약학과")+1);
  				}
  			break;
  			case 2:
  				if(Tempbtn == btn[1]) {
  					map.put("행정학과",map.get("행정학과")+1);
  					map.put("전산통계학과",map.get("전산통계학과")+1);
  					map.put("음악학부",map.get("음악학부")+1);
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					
  					map.put("국어교육과",map.get("국어교육과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("지리교육과",map.get("지리교육과")+1);
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("패션의류학과",map.get("패션의류학과")+1);
  					map.put("의예과",map.get("의예과")+1);
  					map.put("초등교육과",map.get("초등교육과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("간호학과",map.get("간호학과")+1);
  				}
  				break;

  			case 3:
  				if(Tempbtn == btn[1]) {
  					map.put("국어국문학과",map.get("국어국문학과")+1);
  					map.put("영어영문학과",map.get("영어영문학과")+1);
  					map.put("일어일문학과",map.get("일어일문학과")+1);
  					map.put("중어중문학과",map.get("중어중문학과")+1);
  					map.put("독일학과",map.get("독일학과")+1);
  					map.put("사학과",map.get("사학과")+1);
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("철학과",map.get("철학과")+1);
  					map.put("행정학과",map.get("행정학과")+1);
  					map.put("정치외교학과",map.get("정치외교학과")+1);
  					map.put("언론홍보학과",map.get("언론홍보학과")+1);
  					map.put("경영학과",map.get("경영학과")+1);
  					map.put("관광경영학과",map.get("관광경영학과")+1);
  					map.put("회계학과",map.get("회계학과")+1);
  					map.put("무역학과",map.get("무역학과")+1);
  					map.put("경제학과",map.get("경제학과")+1);
  					map.put("관광개발학과",map.get("관광개발학과")+1);
  					map.put("경영정보학과",map.get("경영정보학과")+1);
  					map.put("국어교육과",map.get("국어교육과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("지리교육과",map.get("지리교육과")+1);
  					map.put("체육교육과",map.get("체육교육과")+1);
  					map.put("아동생활복지전공",map.get("아동생활복지전공")+1);
  					map.put("주거가족복지전공",map.get("주거가족복지전공")+1);
  					map.put("패션의류학과",map.get("패션의류학과")+1);
  					map.put("체육학과",map.get("체육학과")+1);
  					map.put("초등교육과",map.get("초등교육과")+1);
  					map.put("음악학부",map.get("음악학부")+1);
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  					map.put("건강뷰티향장학과",map.get("건강뷰티향장학과")+1);
  					map.put("실버케어복지학과",map.get("실버케어복지학과")+1);
  					map.put("관광융복합학과",map.get("관광융복합학과")+1);
  					map.put("부동산관리학과",map.get("부동산관리학과")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("물리교육전공",map.get("물리교육전공")+1);
  					map.put("식물자원환경전공",map.get("식물자원환경전공")+1);
  					map.put("원예환경전공",map.get("원예환경전공")+1);
  					map.put("바이오소재전공",map.get("바이오소재전공")+1);
  					map.put("분자생명공학전공",map.get("분자생명공학전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("산업응용경제학과",map.get("산업응용경제학과")+1);
  					map.put("해양생명과학과",map.get("해양생명과학과")+1);
  					map.put("수산생명의학과",map.get("수산생명의학과")+1);
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  					map.put("지구해양과학과",map.get("지구해양과학과")+1);
  					map.put("환경공학과",map.get("환경공학과")+1);
  					map.put("토목공학과",map.get("토목공학과")+1);
  					map.put("해양시스템공학과",map.get("해양시스템공학과")+1);
  					map.put("물리학과",map.get("물리학과")+1);
  					map.put("생물학과",map.get("생물학과")+1);
  					map.put("화학코스메틱스학과",map.get("화학코스메틱스학과")+1);
  					map.put("식품영양학과",map.get("식품영양학과")+1);
  					map.put("수학과",map.get("수학과")+1);
  					map.put("전산통계학과",map.get("전산통계학과")+1);
  					map.put("식품생명공학과",map.get("식품생명공학과")+1);
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  					map.put("의예과",map.get("의예과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("간호학과",map.get("간호학과")+1);
  					map.put("약학과",map.get("약학과")+1);
  				}
  				break;
  			case 4:
  				if(Tempbtn == btn[1]) {
  					map.put("국어국문학과",map.get("국어국문학과")+1);
  					map.put("영어영문학과",map.get("영어영문학과")+1);
  					map.put("일어일문학과",map.get("일어일문학과")+1);
  					map.put("중어중문학과",map.get("중어중문학과")+1);
  					map.put("독일학과",map.get("독일학과")+1);
  					map.put("사학과",map.get("사학과")+1);
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("철학과",map.get("철학과")+1);
  					map.put("행정학과",map.get("행정학과")+1);
  					map.put("정치외교학과",map.get("정치외교학과")+1);
  					map.put("언론홍보학과",map.get("언론홍보학과")+1);
  					map.put("경영학과",map.get("경영학과")+1);
  					map.put("관광경영학과",map.get("관광경영학과")+1);
  					map.put("회계학과",map.get("회계학과")+1);
  					map.put("무역학과",map.get("무역학과")+1);
  					map.put("경제학과",map.get("경제학과")+1);
  					map.put("관광개발학과",map.get("관광개발학과")+1);
  					map.put("경영정보학과",map.get("경영정보학과")+1);
  					map.put("국어교육과",map.get("국어교육과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("지리교육과",map.get("지리교육과")+1);
  					map.put("체육교육과",map.get("체육교육과")+1);
  					map.put("아동생활복지전공",map.get("아동생활복지전공")+1);
  					map.put("주거가족복지전공",map.get("주거가족복지전공")+1);
  					map.put("패션의류학과",map.get("패션의류학과")+1);
  					map.put("체육학과",map.get("체육학과")+1);
  					map.put("초등교육과",map.get("초등교육과")+1);
  					map.put("음악학부",map.get("음악학부")+1);
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  					map.put("건강뷰티향장학과",map.get("건강뷰티향장학과")+1);
  					map.put("실버케어복지학과",map.get("실버케어복지학과")+1);
  					map.put("관광융복합학과",map.get("관광융복합학과")+1);
  					map.put("부동산관리학과",map.get("부동산관리학과")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("물리교육전공",map.get("물리교육전공")+1);
  					map.put("식물자원환경전공",map.get("식물자원환경전공")+1);
  					map.put("원예환경전공",map.get("원예환경전공")+1);
  					map.put("바이오소재전공",map.get("바이오소재전공")+1);
  					map.put("분자생명공학전공",map.get("분자생명공학전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("산업응용경제학과",map.get("산업응용경제학과")+1);
  					map.put("해양생명과학과",map.get("해양생명과학과")+1);
  					map.put("수산생명의학과",map.get("수산생명의학과")+1);
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  					map.put("지구해양과학과",map.get("지구해양과학과")+1);
  					map.put("환경공학과",map.get("환경공학과")+1);
  					map.put("토목공학과",map.get("토목공학과")+1);
  					map.put("해양시스템공학과",map.get("해양시스템공학과")+1);
  					map.put("물리학과",map.get("물리학과")+1);
  					map.put("생물학과",map.get("생물학과")+1);
  					map.put("화학코스메틱스학과",map.get("화학코스메틱스학과")+1);
  					map.put("식품영양학과",map.get("식품영양학과")+1);
  					map.put("수학과",map.get("수학과")+1);
  					map.put("전산통계학과",map.get("전산통계학과")+1);
  					map.put("식품생명공학과",map.get("식품생명공학과")+1);
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  					map.put("의예과",map.get("의예과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("간호학과",map.get("간호학과")+1);
  					map.put("약학과",map.get("약학과")+1);
  				}
  				break;
  			case 5:
  				if(Tempbtn == btn[1]) {
  					map.put("원예환경전공",map.get("원예환경전공")+1);
  					map.put("바이오소재전공",map.get("바이오소재전공")+1);
  					map.put("분자생명공학전공",map.get("분자생명공학전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("산업응용경제학과",map.get("산업응용경제학과")+1);
  					map.put("해양생명과학과",map.get("해양생명과학과")+1);
  					map.put("수산생명의학과",map.get("수산생명의학과")+1);
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  					map.put("지구해양과학과",map.get("지구해양과학과")+1);
  					map.put("환경공학과",map.get("환경공학과")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("토목공학과",map.get("토목공학과")+1);
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  				}
  				break;
  			case 6:
  				if(Tempbtn == btn[1]) {
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  				}
  				break;
  			case 7:
  				if(Tempbtn == btn[1]) {
  					map.put("의예과",map.get("의예과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  				}
  				break;
  			case 8:
  				if(Tempbtn == btn[1]) {
  					map.put("국어국문학과",map.get("국어국문학과")+1);
  					map.put("영어영문학과",map.get("영어영문학과")+1);
  					map.put("일어일문학과",map.get("일어일문학과")+1);
  					map.put("중어중문학과",map.get("중어중문학과")+1);
  					map.put("독일학과",map.get("독일학과")+1);
  					map.put("사학과",map.get("사학과")+1);
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("철학과",map.get("철학과")+1);
  					map.put("행정학과",map.get("행정학과")+1);
  					map.put("정치외교학과",map.get("정치외교학과")+1);
  					map.put("언론홍보학과",map.get("언론홍보학과")+1);
  					map.put("경영학과",map.get("경영학과")+1);
  					map.put("관광경영학과",map.get("관광경영학과")+1);
  					map.put("회계학과",map.get("회계학과")+1);
  					map.put("무역학과",map.get("무역학과")+1);
  					map.put("경제학과",map.get("경제학과")+1);
  					map.put("관광개발학과",map.get("관광개발학과")+1);
  					map.put("경영정보학과",map.get("경영정보학과")+1);
  					map.put("국어교육과",map.get("국어교육과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("지리교육과",map.get("지리교육과")+1);
  					map.put("체육교육과",map.get("체육교육과")+1);
  					map.put("아동생활복지전공",map.get("아동생활복지전공")+1);
  					map.put("주거가족복지전공",map.get("주거가족복지전공")+1);
  					map.put("패션의류학과",map.get("패션의류학과")+1);
  					map.put("체육학과",map.get("체육학과")+1);
  					map.put("초등교육과",map.get("초등교육과")+1);
  					map.put("음악학부",map.get("음악학부")+1);
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  					map.put("건강뷰티향장학과",map.get("건강뷰티향장학과")+1);
  					map.put("실버케어복지학과",map.get("실버케어복지학과")+1);
  					map.put("관광융복합학과",map.get("관광융복합학과")+1);
  					map.put("부동산관리학과",map.get("부동산관리학과")+1);

  				}
  				if(Tempbtn == btn[2]) {
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("물리교육전공",map.get("물리교육전공")+1);
  					map.put("식물자원환경전공",map.get("식물자원환경전공")+1);
  					map.put("원예환경전공",map.get("원예환경전공")+1);
  					map.put("바이오소재전공",map.get("바이오소재전공")+1);
  					map.put("분자생명공학전공",map.get("분자생명공학전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("산업응용경제학과",map.get("산업응용경제학과")+1);
  					map.put("해양생명과학과",map.get("해양생명과학과")+1);
  					map.put("수산생명의학과",map.get("수산생명의학과")+1);
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  					map.put("지구해양과학과",map.get("지구해양과학과")+1);
  					map.put("환경공학과",map.get("환경공학과")+1);
  					map.put("토목공학과",map.get("토목공학과")+1);
  					map.put("해양시스템공학과",map.get("해양시스템공학과")+1);
  					map.put("물리학과",map.get("물리학과")+1);
  					map.put("생물학과",map.get("생물학과")+1);
  					map.put("화학코스메틱스학과",map.get("화학코스메틱스학과")+1);
  					map.put("식품영양학과",map.get("식품영양학과")+1);
  					map.put("수학과",map.get("수학과")+1);
  					map.put("전산통계학과",map.get("전산통계학과")+1);
  					map.put("식품생명공학과",map.get("식품생명공학과")+1);
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  					map.put("의예과",map.get("의예과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("간호학과",map.get("간호학과")+1);
  					map.put("약학과",map.get("약학과")+1);
  				}
  				break;
  			case 9:
  				if(Tempbtn == btn[1]) {
  					map.put("해양생명과학과",map.get("해양생명과학과")+1);
  					map.put("수산생명의학과",map.get("수산생명의학과")+1);
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  					map.put("지구해양과학과",map.get("지구해양과학과")+1);
  					map.put("환경공학과",map.get("환경공학과")+1);
  					map.put("토목공학과",map.get("토목공학과")+1);
  					map.put("해양시스템공학과",map.get("해양시스템공학과")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("패션의류학과",map.get("패션의류학과")+1);
  					map.put("음악학부",map.get("음악학부")+1);
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  				}
  				break;
  			case 10:
  				if(Tempbtn == btn[1]) {
  					map.put("국어국문학과",map.get("국어국문학과")+1);
  					map.put("영어영문학과",map.get("영어영문학과")+1);
  					map.put("일어일문학과",map.get("일어일문학과")+1);
  					map.put("중어중문학과",map.get("중어중문학과")+1);
  					map.put("독일학과",map.get("독일학과")+1);
  					map.put("국어교육과",map.get("국어교육과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("지리교육과",map.get("지리교육과")+1);
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("물리교육전공",map.get("물리교육전공")+1);
  					map.put("체육교육과",map.get("체육교육과")+1);
  				}
  				break;
  			case 11:
  				if(Tempbtn == btn[2]) {
  					map.put("영어영문학과",map.get("영어영문학과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("물리교육전공",map.get("물리교육전공")+1);
  					map.put("식물자원환경전공",map.get("식물자원환경전공")+1);
  					map.put("원예환경전공",map.get("원예환경전공")+1);
  					map.put("바이오소재전공",map.get("바이오소재전공")+1);
  					map.put("분자생명공학전공",map.get("분자생명공학전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("산업응용경제학과",map.get("산업응용경제학과")+1);
  					map.put("해양생명과학과",map.get("해양생명과학과")+1);
  					map.put("수산생명의학과",map.get("수산생명의학과")+1);
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  					map.put("지구해양과학과",map.get("지구해양과학과")+1);
  					map.put("환경공학과",map.get("환경공학과")+1);
  					map.put("토목공학과",map.get("토목공학과")+1);
  					map.put("해양시스템공학과",map.get("해양시스템공학과")+1);
  					map.put("물리학과",map.get("물리학과")+1);
  					map.put("생물학과",map.get("생물학과")+1);
  					map.put("화학코스메틱스학과",map.get("화학코스메틱스학과")+1);
  					map.put("식품영양학과",map.get("식품영양학과")+1);
  					map.put("수학과",map.get("수학과")+1);
  					map.put("전산통계학과",map.get("전산통계학과")+1);
  					map.put("식품생명공학과",map.get("식품생명공학과")+1);
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  					map.put("의예과",map.get("의예과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("간호학과",map.get("간호학과")+1);
  					map.put("약학과",map.get("약학과")+1);

  				}
  				break;
  			case 12:
  				if(Tempbtn == btn[1]) {
  					map.put("토목공학과",map.get("토목공학과")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  				}
 				if(Tempbtn == btn[2]) {
 					map.put("경영학과",map.get("경영학과")+1);
 					map.put("관광경영학과",map.get("관광경영학과")+1);
 					map.put("경제학과",map.get("경제학과")+1);
 					map.put("부동산관리학과",map.get("부동산관리학과")+1);
 				}
 				break;
  			case 13:
  				if(Tempbtn == btn[1]) {
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("영어영문학과",map.get("영어영문학과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);

  				}
  				break;
  			case 14:
  				if(Tempbtn == btn[1]) {
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("철학과",map.get("철학과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("수학과",map.get("수학과")+1);
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  				}
  				break;
  			case 15:
  				if(Tempbtn == btn[1]) {
  					map.put("경영정보학과",map.get("경영정보학과")+1);
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("전산통계학과",map.get("전산통계학과")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  				}
  				break;
  			case 16:
  				if(Tempbtn == btn[1]) {
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("음악학부",map.get("음악학부")+1);
  				}
  				break;
  			case 17:
  				if(Tempbtn == btn[1]) {
  					map.put("의예과",map.get("의예과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("간호학과",map.get("간호학과")+1);
  					map.put("건강뷰티향장학과",map.get("건강뷰티향장학과")+1);
  					map.put("실버케어복지학과",map.get("실버케어복지학과")+1);
  					map.put("약학과",map.get("약학과")+1);
  				}
  				break;
  			case 18:
  				if(Tempbtn == btn[2]) {
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  				}
  				break;
  			case 19:
  				if(Tempbtn == btn[2]) {
  					map.put("체육교육과",map.get("체육교육과")+1);
  					map.put("분자생명공학전공",map.get("분자생명공학전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("체육학과",map.get("체육학과")+1);
  					map.put("의예과",map.get("의예과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("간호학과",map.get("간호학과")+1);
  				}
  				break;
  			case 20:
  				if(Tempbtn == btn[1]) {
  					map.put("바이오소재전공",map.get("바이오소재전공")+1);
  					map.put("화학코스메틱스학과",map.get("화학코스메틱스학과")+1);
  					map.put("의예과",map.get("의예과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("약학과",map.get("약학과")+1);
  				}
  				break;
  			case 21:
  				if(Tempbtn == btn[2]) {
  					map.put("국어교육과",map.get("국어교육과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("지리교육과",map.get("지리교육과")+1);
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("물리교육전공",map.get("물리교육전공")+1);
  					map.put("체육교육과",map.get("체육교육과")+1);
  				}
  				break;
  			case 22:
  				if(Tempbtn == btn[1]) {
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  				}
  				break;
  			case 23:
  				if(Tempbtn == btn[2]) {
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("철학과",map.get("철학과")+1);
  					map.put("행정학과",map.get("행정학과")+1);
  					map.put("정치외교학과",map.get("정치외교학과")+1);
  					map.put("언론홍보학과",map.get("언론홍보학과")+1);
  					map.put("경영학과",map.get("경영학과")+1);
  					map.put("관광경영학과",map.get("관광경영학과")+1);
  					map.put("관광개발학과",map.get("관광개발학과")+1);
  					map.put("국어교육과",map.get("국어교육과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("지리교육과",map.get("지리교육과")+1);
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("물리교육전공",map.get("물리교육전공")+1);
  					map.put("체육교육과",map.get("체육교육과")+1);
  				
  				}
  				break;
  			case 24:
  				if(Tempbtn == btn[1]) {
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  				}
  				break;
  			case 25:
  				if(Tempbtn == btn[1]) {
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("철학과",map.get("철학과")+1);
  					map.put("행정학과",map.get("행정학과")+1);
  					map.put("정치외교학과",map.get("정치외교학과")+1);
  					map.put("언론홍보학과",map.get("언론홍보학과")+1);
  					map.put("경영학과",map.get("경영학과")+1);
  					map.put("관광경영학과",map.get("관광경영학과")+1);
  					map.put("경제학과",map.get("경제학과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  				}
  				break;
  			case 26:
  				if(Tempbtn == btn[1]) {
  					map.put("바이오소재전공",map.get("바이오소재전공")+1);
  					map.put("분자생명공학전공",map.get("분자생명공학전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("화학코스메틱스학과",map.get("화학코스메틱스학과")+1);
  					map.put("건강뷰티향장학과",map.get("건강뷰티향장학과")+1);
  				}
  				break;
  			case 27:
  				if(Tempbtn == btn[1]) {
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("수학과",map.get("수학과")+1);
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  				}
  				break;
  			case 28:
  				if(Tempbtn == btn[1]) {
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("실버케어복지학과",map.get("실버케어복지학과")+1);
  				}
  				break;
  			case 29:
  				if(Tempbtn == btn[1]) {
  					map.put("경영학과",map.get("경영학과")+1);
  					map.put("관광경영학과",map.get("관광경영학과")+1);
  				}
  				break;
  			case 30:
  				if(Tempbtn == btn[1]) {
  					map.put("체육교육과",map.get("체육교육과")+1);
  					map.put("체육학과",map.get("체육학과")+1);
  				}
  				break;
  			case 31:
  				if(Tempbtn == btn[1]) {
  					map.put("음악학부",map.get("음악학부")+1);
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  					map.put("건강뷰티향장학과",map.get("건강뷰티향장학과")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("경제학과",map.get("경제학과")+1);
  					map.put("경영정보학과",map.get("경영정보학과")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  				}
  				break;
  			case 32:
  				if(Tempbtn == btn[1]) {
  					map.put("국어국문학과",map.get("국어국문학과")+1);
  					map.put("영어영문학과",map.get("영어영문학과")+1);
  					map.put("일어일문학과",map.get("일어일문학과")+1);
  					map.put("중어중문학과",map.get("중어중문학과")+1);
  					map.put("독일학과",map.get("독일학과")+1);
  					map.put("사학과",map.get("사학과")+1);
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("철학과",map.get("철학과")+1);
  					map.put("행정학과",map.get("행정학과")+1);
  					map.put("정치외교학과",map.get("정치외교학과")+1);
  					map.put("언론홍보학과",map.get("언론홍보학과")+1);
  					map.put("경영학과",map.get("경영학과")+1);
  					map.put("관광경영학과",map.get("관광경영학과")+1);
  					map.put("회계학과",map.get("회계학과")+1);
  					map.put("무역학과",map.get("무역학과")+1);
  					map.put("경제학과",map.get("경제학과")+1);
  					map.put("관광개발학과",map.get("관광개발학과")+1);
  					map.put("경영정보학과",map.get("경영정보학과")+1);
  					map.put("국어교육과",map.get("국어교육과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("지리교육과",map.get("지리교육과")+1);
  					map.put("체육교육과",map.get("체육교육과")+1);
  					map.put("아동생활복지전공",map.get("아동생활복지전공")+1);
  					map.put("주거가족복지전공",map.get("주거가족복지전공")+1);
  					map.put("패션의류학과",map.get("패션의류학과")+1);
  					map.put("체육학과",map.get("체육학과")+1);
  					map.put("초등교육과",map.get("초등교육과")+1);
  					map.put("음악학부",map.get("음악학부")+1);
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  					map.put("건강뷰티향장학과",map.get("건강뷰티향장학과")+1);
  					map.put("실버케어복지학과",map.get("실버케어복지학과")+1);
  					map.put("관광융복합학과",map.get("관광융복합학과")+1);
  					map.put("부동산관리학과",map.get("부동산관리학과")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("물리교육전공",map.get("물리교육전공")+1);
  					map.put("식물자원환경전공",map.get("식물자원환경전공")+1);
  					map.put("원예환경전공",map.get("원예환경전공")+1);
  					map.put("바이오소재전공",map.get("바이오소재전공")+1);
  					map.put("분자생명공학전공",map.get("분자생명공학전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("산업응용경제학과",map.get("산업응용경제학과")+1);
  					map.put("해양생명과학과",map.get("해양생명과학과")+1);
  					map.put("수산생명의학과",map.get("수산생명의학과")+1);
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  					map.put("지구해양과학과",map.get("지구해양과학과")+1);
  					map.put("환경공학과",map.get("환경공학과")+1);
  					map.put("토목공학과",map.get("토목공학과")+1);
  					map.put("해양시스템공학과",map.get("해양시스템공학과")+1);
  					map.put("물리학과",map.get("물리학과")+1);
  					map.put("생물학과",map.get("생물학과")+1);
  					map.put("화학코스메틱스학과",map.get("화학코스메틱스학과")+1);
  					map.put("식품영양학과",map.get("식품영양학과")+1);
  					map.put("수학과",map.get("수학과")+1);
  					map.put("전산통계학과",map.get("전산통계학과")+1);
  					map.put("식품생명공학과",map.get("식품생명공학과")+1);
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  					map.put("의예과",map.get("의예과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("간호학과",map.get("간호학과")+1);
  					map.put("약학과",map.get("약학과")+1);
  				}
  			case 33:
  				if(Tempbtn == btn[1]) {
  					map.put("독일학과",map.get("독일학과")+1);
  				}
  				break;
  			case 34:
  				if(Tempbtn == btn[1]) {
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("행정학과",map.get("행정학과")+1);
  					map.put("정치외교학과",map.get("정치외교학과")+1);
  					map.put("무역학과",map.get("무역학과")+1);
  					map.put("경제학과",map.get("경제학과")+1);
  					map.put("관광개발학과",map.get("관광개발학과")+1);
  				}
  				break;
  			case 35:
  				if(Tempbtn == btn[1]) {
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  				}
  				break;
  			case 36:
  				if(Tempbtn == btn[1]) {
  					map.put("국어국문학과",map.get("국어국문학과")+1);
  					map.put("영어영문학과",map.get("영어영문학과")+1);
  					map.put("일어일문학과",map.get("일어일문학과")+1);
  					map.put("중어중문학과",map.get("중어중문학과")+1);
  					map.put("독일학과",map.get("독일학과")+1);
  					map.put("사학과",map.get("사학과")+1);
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("철학과",map.get("철학과")+1);
  					map.put("행정학과",map.get("행정학과")+1);
  					map.put("정치외교학과",map.get("정치외교학과")+1);
  					map.put("언론홍보학과",map.get("언론홍보학과")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("경영학과",map.get("경영학과")+1);
  					map.put("관광경영학과",map.get("관광경영학과")+1);
  					map.put("회계학과",map.get("회계학과")+1);
  					map.put("무역학과",map.get("무역학과")+1);
  					map.put("경제학과",map.get("경제학과")+1);
  					map.put("관광개발학과",map.get("관광개발학과")+1);
  					map.put("경영정보학과",map.get("경영정보학과")+1);
  					map.put("국어교육과",map.get("국어교육과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("지리교육과",map.get("지리교육과")+1);
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("물리교육전공",map.get("물리교육전공")+1);
  					map.put("체육교육과",map.get("체육교육과")+1);
  					map.put("식물자원환경전공",map.get("식물자원환경전공")+1);
  					map.put("원예환경전공",map.get("원예환경전공")+1);
  					map.put("바이오소재전공",map.get("바이오소재전공")+1);
  					map.put("분자생명공학전공",map.get("분자생명공학전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("산업응용경제학과",map.get("산업응용경제학과")+1);
  					map.put("해양생명과학과",map.get("해양생명과학과")+1);
  					map.put("수산생명의학과",map.get("수산생명의학과")+1);
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  					map.put("지구해양과학과",map.get("지구해양과학과")+1);
  					map.put("환경공학과",map.get("환경공학과")+1);
  					map.put("토목공학과",map.get("토목공학과")+1);
  					map.put("해양시스템공학과",map.get("해양시스템공학과")+1);
  					map.put("물리학과",map.get("물리학과")+1);
  					map.put("생물학과",map.get("생물학과")+1);
  					map.put("화학코스메틱스학과",map.get("화학코스메틱스학과")+1);
  					map.put("식품영양학과",map.get("식품영양학과")+1);
  					map.put("수학과",map.get("수학과")+1);
  					map.put("전산통계학과",map.get("전산통계학과")+1);
  					map.put("아동생활복지전공",map.get("아동생활복지전공")+1);
  					map.put("주거가족복지전공",map.get("주거가족복지전공")+1);
  					map.put("패션의류학과",map.get("패션의류학과")+1);
  					map.put("체육학과",map.get("체육학과")+1);
  					map.put("식품생명공학과",map.get("식품생명공학과")+1);
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  					map.put("의예과",map.get("의예과")+1);
  					map.put("초등교육과",map.get("초등교육과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("간호학과",map.get("간호학과")+1);
  					map.put("음악학부",map.get("음악학부")+1);
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  					map.put("건강뷰티향장학과",map.get("건강뷰티향장학과")+1);
  					map.put("실버케어복지학과",map.get("실버케어복지학과")+1);
  					map.put("관광융복합학과",map.get("관광융복합학과")+1);
  					map.put("부동산관리학과",map.get("부동산관리학과")+1);
  					map.put("약학과",map.get("약학과")+1);
  				}
  				break;
  			case 37:
  				if(Tempbtn == btn[1]) {
  					map.put("행정학과",map.get("행정학과")+1);
  					map.put("정치외교학과",map.get("정치외교학과")+1);
  					map.put("언론홍보학과",map.get("언론홍보학과")+1);
  					map.put("경영학과",map.get("경영학과")+1);
  					map.put("관광경영학과",map.get("관광경영학과")+1);
  					map.put("회계학과",map.get("회계학과")+1);
  					map.put("무역학과",map.get("무역학과")+1);
  					map.put("경제학과",map.get("경제학과")+1);
  					map.put("관광개발학과",map.get("관광개발학과")+1);
  					map.put("경영정보학과",map.get("경영정보학과")+1);
  					map.put("국어교육과",map.get("국어교육과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("지리교육과",map.get("지리교육과")+1);
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("물리교육전공",map.get("물리교육전공")+1);
  					map.put("체육교육과",map.get("체육교육과")+1);
  					map.put("식물자원환경전공",map.get("식물자원환경전공")+1);
  					map.put("원예환경전공",map.get("원예환경전공")+1);
  					map.put("바이오소재전공",map.get("바이오소재전공")+1);
  					map.put("분자생명공학전공",map.get("분자생명공학전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("산업응용경제학과",map.get("산업응용경제학과")+1);
  					map.put("해양생명과학과",map.get("해양생명과학과")+1);
  					map.put("수산생명의학과",map.get("수산생명의학과")+1);
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  					map.put("지구해양과학과",map.get("지구해양과학과")+1);
  					map.put("환경공학과",map.get("환경공학과")+1);
  					map.put("토목공학과",map.get("토목공학과")+1);
  					map.put("해양시스템공학과",map.get("해양시스템공학과")+1);
  					map.put("물리학과",map.get("물리학과")+1);
  					map.put("생물학과",map.get("생물학과")+1);
  					map.put("화학코스메틱스학과",map.get("화학코스메틱스학과")+1);
  					map.put("식품영양학과",map.get("식품영양학과")+1);
  					map.put("수학과",map.get("수학과")+1);
  					map.put("전산통계학과",map.get("전산통계학과")+1);
  					map.put("아동생활복지전공",map.get("아동생활복지전공")+1);
  					map.put("주거가족복지전공",map.get("주거가족복지전공")+1);
  					map.put("패션의류학과",map.get("패션의류학과")+1);
  					map.put("체육학과",map.get("체육학과")+1);
  					map.put("식품생명공학과",map.get("식품생명공학과")+1);
  					map.put("음악학부",map.get("음악학부")+1);
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  					map.put("건강뷰티향장학과",map.get("건강뷰티향장학과")+1);
  					map.put("실버케어복지학과",map.get("실버케어복지학과")+1);
  					map.put("관광융복합학과",map.get("관광융복합학과")+1);
  					map.put("부동산관리학과",map.get("부동산관리학과")+1);
  					map.put("약학과",map.get("약학과")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("국어국문학과",map.get("국어국문학과")+1);
  					map.put("영어영문학과",map.get("영어영문학과")+1);
  					map.put("일어일문학과",map.get("일어일문학과")+1);
  					map.put("중어중문학과",map.get("중어중문학과")+1);
  					map.put("독일학과",map.get("독일학과")+1);
  					map.put("사학과",map.get("사학과")+1);
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("철학과",map.get("철학과")+1);
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  					map.put("의예과",map.get("의예과")+1);
  					map.put("초등교육과",map.get("초등교육과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("간호학과",map.get("간호학과")+1);
  				}
  				break;
  			case 38:
  				if(Tempbtn == btn[1]) {
  					map.put("국어국문학과",map.get("국어국문학과")+1);
  					map.put("영어영문학과",map.get("영어영문학과")+1);
  					map.put("일어일문학과",map.get("일어일문학과")+1);
  					map.put("중어중문학과",map.get("중어중문학과")+1);
  					map.put("독일학과",map.get("독일학과")+1);
  					map.put("식물자원환경전공",map.get("식물자원환경전공")+1);
  					map.put("원예환경전공",map.get("원예환경전공")+1);
  					map.put("바이오소재전공",map.get("바이오소재전공")+1);
  					map.put("분자생명공학전공",map.get("분자생명공학전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("산업응용경제학과",map.get("산업응용경제학과")+1);
  					map.put("해양생명과학과",map.get("해양생명과학과")+1);
  					map.put("수산생명의학과",map.get("수산생명의학과")+1);
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  					map.put("지구해양과학과",map.get("지구해양과학과")+1);
  					map.put("환경공학과",map.get("환경공학과")+1);
  					map.put("토목공학과",map.get("토목공학과")+1);
  					map.put("해양시스템공학과",map.get("해양시스템공학과")+1);
  					map.put("물리학과",map.get("물리학과")+1);
  					map.put("생물학과",map.get("생물학과")+1);
  					map.put("화학코스메틱스학과",map.get("화학코스메틱스학과")+1);
  					map.put("식품영양학과",map.get("식품영양학과")+1);
  					map.put("수학과",map.get("수학과")+1);
  					map.put("전산통계학과",map.get("전산통계학과")+1);
  					map.put("아동생활복지전공",map.get("아동생활복지전공")+1);
  					map.put("주거가족복지전공",map.get("주거가족복지전공")+1);
  					map.put("패션의류학과",map.get("패션의류학과")+1);
  					map.put("체육학과",map.get("체육학과")+1);
  					map.put("식품생명공학과",map.get("식품생명공학과")+1);
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  					map.put("의예과",map.get("의예과")+1);
  					map.put("초등교육과",map.get("초등교육과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("간호학과",map.get("간호학과")+1);
  					map.put("건강뷰티향장학과",map.get("건강뷰티향장학과")+1);
  					map.put("실버케어복지학과",map.get("실버케어복지학과")+1);
  					map.put("관광융복합학과",map.get("관광융복합학과")+1);
  					map.put("부동산관리학과",map.get("부동산관리학과")+1);
  					map.put("약학과",map.get("약학과")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("사학과",map.get("사학과")+1);
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("철학과",map.get("철학과")+1);
  					map.put("행정학과",map.get("행정학과")+1);
  					map.put("정치외교학과",map.get("정치외교학과")+1);
  					map.put("언론홍보학과",map.get("언론홍보학과")+1);
  					map.put("경영학과",map.get("경영학과")+1);
  					map.put("관광경영학과",map.get("관광경영학과")+1);
  					map.put("회계학과",map.get("회계학과")+1);
  					map.put("무역학과",map.get("무역학과")+1);
  					map.put("경제학과",map.get("경제학과")+1);
  					map.put("관광개발학과",map.get("관광개발학과")+1);
  					map.put("경영정보학과",map.get("경영정보학과")+1);
  					map.put("국어교육과",map.get("국어교육과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("지리교육과",map.get("지리교육과")+1);
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("물리교육전공",map.get("물리교육전공")+1);
  					map.put("체육교육과",map.get("체육교육과")+1);
  					map.put("음악학부",map.get("음악학부")+1);
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  				}
  				break;
  			case 39:
  				if(Tempbtn == btn[1]) {
  					map.put("국어국문학과",map.get("국어국문학과")+1);
  					map.put("영어영문학과",map.get("영어영문학과")+1);
  					map.put("일어일문학과",map.get("일어일문학과")+1);
  					map.put("중어중문학과",map.get("중어중문학과")+1);
  					map.put("독일학과",map.get("독일학과")+1);
  					map.put("사학과",map.get("사학과")+1);
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("철학과",map.get("철학과")+1);
  					map.put("식물자원환경전공",map.get("식물자원환경전공")+1);
  					map.put("원예환경전공",map.get("원예환경전공")+1);
  					map.put("바이오소재전공",map.get("바이오소재전공")+1);
  					map.put("분자생명공학전공",map.get("분자생명공학전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("산업응용경제학과",map.get("산업응용경제학과")+1);
  					map.put("해양생명과학과",map.get("해양생명과학과")+1);
  					map.put("수산생명의학과",map.get("수산생명의학과")+1);
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  					map.put("지구해양과학과",map.get("지구해양과학과")+1);
  					map.put("환경공학과",map.get("환경공학과")+1);
  					map.put("토목공학과",map.get("토목공학과")+1);
  					map.put("해양시스템공학과",map.get("해양시스템공학과")+1);
  					map.put("물리학과",map.get("물리학과")+1);
  					map.put("생물학과",map.get("생물학과")+1);
  					map.put("화학코스메틱스학과",map.get("화학코스메틱스학과")+1);
  					map.put("식품영양학과",map.get("식품영양학과")+1);
  					map.put("수학과",map.get("수학과")+1);
  					map.put("전산통계학과",map.get("전산통계학과")+1);
  					map.put("아동생활복지전공",map.get("아동생활복지전공")+1);
  					map.put("주거가족복지전공",map.get("주거가족복지전공")+1);
  					map.put("패션의류학과",map.get("패션의류학과")+1);
  					map.put("체육학과",map.get("체육학과")+1);
  					map.put("식품생명공학과",map.get("식품생명공학과")+1);
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  					map.put("의예과",map.get("의예과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("음악학부",map.get("음악학부")+1);
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  					map.put("약학과",map.get("약학과")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("행정학과",map.get("행정학과")+1);
  					map.put("정치외교학과",map.get("정치외교학과")+1);
  					map.put("언론홍보학과",map.get("언론홍보학과")+1);
  					map.put("경영학과",map.get("경영학과")+1);
  					map.put("관광경영학과",map.get("관광경영학과")+1);
  					map.put("회계학과",map.get("회계학과")+1);
  					map.put("무역학과",map.get("무역학과")+1);
  					map.put("경제학과",map.get("경제학과")+1);
  					map.put("관광개발학과",map.get("관광개발학과")+1);
  					map.put("경영정보학과",map.get("경영정보학과")+1);
  					map.put("국어교육과",map.get("국어교육과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("지리교육과",map.get("지리교육과")+1);
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("물리교육전공",map.get("물리교육전공")+1);
  					map.put("체육교육과",map.get("체육교육과")+1);
  					map.put("초등교육과",map.get("초등교육과")+1);
  					map.put("간호학과",map.get("간호학과")+1);
  					map.put("건강뷰티향장학과",map.get("건강뷰티향장학과")+1);
  					map.put("실버케어복지학과",map.get("실버케어복지학과")+1);
  					map.put("관광융복합학과",map.get("관광융복합학과")+1);
  					map.put("부동산관리학과",map.get("부동산관리학과")+1);
  				}
  				break;
  			case 40:
  				if(Tempbtn == btn[1]) {
  					map.put("국어국문학과",map.get("국어국문학과")+1);
  					map.put("영어영문학과",map.get("영어영문학과")+1);
  					map.put("일어일문학과",map.get("일어일문학과")+1);
  					map.put("중어중문학과",map.get("중어중문학과")+1);
  					map.put("독일학과",map.get("독일학과")+1);
  					map.put("사학과",map.get("사학과")+1);
  					map.put("사회학과",map.get("사회학과")+1);
  					map.put("철학과",map.get("철학과")+1);
  					map.put("행정학과",map.get("행정학과")+1);
  					map.put("정치외교학과",map.get("정치외교학과")+1);
  					map.put("언론홍보학과",map.get("언론홍보학과")+1);
  					map.put("국어교육과",map.get("국어교육과")+1);
  					map.put("영어교육과",map.get("영어교육과")+1);
  					map.put("윤리교육과",map.get("윤리교육과")+1);
  					map.put("일반사회교육과",map.get("일반사회교육과")+1);
  					map.put("지리교육과",map.get("지리교육과")+1);
  					map.put("수학교육과",map.get("수학교육과")+1);
  					map.put("컴퓨터교육과",map.get("컴퓨터교육과")+1);
  					map.put("생물교육전공",map.get("생물교육전공")+1);
  					map.put("물리교육전공",map.get("물리교육전공")+1);
  					map.put("체육교육과",map.get("체육교육과")+1);
  					map.put("식물자원환경전공",map.get("식물자원환경전공")+1);
  					map.put("원예환경전공",map.get("원예환경전공")+1);
  					map.put("바이오소재전공",map.get("바이오소재전공")+1);
  					map.put("분자생명공학전공",map.get("분자생명공학전공")+1);
  					map.put("동물생명공학전공",map.get("동물생명공학전공")+1);
  					map.put("해양생명과학과",map.get("해양생명과학과")+1);
  					map.put("수산생명의학과",map.get("수산생명의학과")+1);
  					map.put("해양산업경찰학과",map.get("해양산업경찰학과")+1);
  					map.put("지구해양과학과",map.get("지구해양과학과")+1);
  					map.put("환경공학과",map.get("환경공학과")+1);
  					map.put("토목공학과",map.get("토목공학과")+1);
  					map.put("해양시스템공학과",map.get("해양시스템공학과")+1);
  					map.put("물리학과",map.get("물리학과")+1);
  					map.put("생물학과",map.get("생물학과")+1);
  					map.put("화학코스메틱스학과",map.get("화학코스메틱스학과")+1);
  					map.put("식품영양학과",map.get("식품영양학과")+1);
  					map.put("아동생활복지전공",map.get("아동생활복지전공")+1);
  					map.put("주거가족복지전공",map.get("주거가족복지전공")+1);
  					map.put("체육학과",map.get("체육학과")+1);
  					map.put("식품생명공학과",map.get("식품생명공학과")+1);
  					map.put("기계공학전공",map.get("기계공학전공")+1);
  					map.put("메카트로닉스공학전공",map.get("메카트로닉스공학전공")+1);
  					map.put("전파정보통신공학전공",map.get("전파정보통신공학전공")+1);
  					map.put("에너지공학전공",map.get("에너지공학전공")+1);
  					map.put("컴퓨터공학전공",map.get("컴퓨터공학전공")+1);
  					map.put("전자공학전공",map.get("전자공학전공")+1);
  					map.put("전기공학전공",map.get("전기공학전공")+1);
  					map.put("생명화학전공",map.get("생명화학전공")+1);
  					map.put("건축공학전공",map.get("건축공학전공")+1);
  					map.put("건축학전공",map.get("건축학전공")+1);
  					map.put("의예과",map.get("의예과")+1);
  					map.put("초등교육과",map.get("초등교육과")+1);
  					map.put("수의예과",map.get("수의예과")+1);
  					map.put("간호학과",map.get("간호학과")+1);
  					map.put("음악학부",map.get("음악학부")+1);
  					map.put("미술학부",map.get("미술학부")+1);
  					map.put("멀티미디어디자인전공",map.get("멀티미디어디자인전공")+1);
  					map.put("문화조형디자인전공",map.get("문화조형디자인전공")+1);
  					map.put("건강뷰티향장학과",map.get("건강뷰티향장학과")+1);
  					map.put("실버케어복지학과",map.get("실버케어복지학과")+1);
  					map.put("관광융복합학과",map.get("관광융복합학과")+1);
  					map.put("부동산관리학과",map.get("부동산관리학과")+1);
  					map.put("약학과",map.get("약학과")+1);
  					
  					
  				}
  				if(Tempbtn == btn[2]) {
  				//b2
  					map.put("경영학과",map.get("경영학과")+1);
  					map.put("관광경영학과",map.get("관광경영학과")+1);
  					map.put("회계학과",map.get("회계학과")+1);
  					map.put("무역학과",map.get("무역학과")+1);
  					map.put("경제학과",map.get("경제학과")+1);
  					map.put("관광개발학과",map.get("관광개발학과")+1);
  					map.put("경영정보학과",map.get("경영정보학과")+1);
  					map.put("산업응용경제학과",map.get("산업응용경제학과")+1);
  					map.put("수학과",map.get("수학과")+1);
  					map.put("전산통계학과",map.get("전산통계학과")+1);
  					map.put("패션의류학과",map.get("패션의류학과")+1);
  				}
  				
  				JPanel result = new JPanel();
  				result.setLayout(new BorderLayout());
  				String tmpStr = "";
  				int maxValue = 0;
  				Iterator<String> iter = map.keySet().iterator();
  				
  				while(iter.hasNext()) {
  					tmpStr = iter.next();
  					if(map.get(tmpStr) > maxValue) {
  						major = tmpStr;
  						maxValue = map.get(tmpStr);
  					}
  				}
  				
  				JLabel resultText = new JLabel("제스트가 추천하는 학과는 "+ major);
  				HashMap<String, String> linkMap = LinkMapGenerator.getLinkMap();
  				String url = linkMap.get(major);
  				String career = Crawler.execute(url);
  				String res = "";
  				String temp[] = career.split("");
  				
  				for(int i = 0; i < temp.length; i++) {
  					if(i % 50 == 0) 
  						res += "\n";
  					res += temp[i];
  				}
  				
  				
  				JLabel careerText = new JLabel(res);
  				//System.out.println(career);
  				resultText.setFont(new Font("나눔고딕", Font.BOLD, 28));
  				resultText.setForeground(new Color(255,255,255));
  				//resultText.setHorizontalAlignment(JLabel.NORTH);
  				
  				result.setBackground(new Color(72, 106, 174));
  				

  		        
  				JButton jb = new RoundButton("제주대학교 " + major + " 바로가기"); 	
  				//jb.setHorizontalAlignment(JButton.SOUTH);

  				JTextArea txtLog = new JTextArea(45,45);
  				txtLog.append(careerText+ ""); 
  				JScrollPane scrollPane = new JScrollPane(txtLog);
  				
  				int index = 0;
  				String temps[] = txtLog.getText().split("");
  				for(index = 0; true; index++) {
  					if(temps[index].equals("\n"))
  						break;
  				}
  				txtLog.replaceRange("", 0, index + 1); //시작부분과 끝점 사이를 공백으로 교체

  				result.add(scrollPane);
  			
  				//result.add(careerText);
  				
  				jb.setFocusPainted(false);
  				jb.setBorderPainted(false);
  				jb.setPreferredSize(new Dimension(520, 50));
  				jb.setBackground(new Color(196,222,255));
  				jb.setForeground(new Color(255,255,255));
  				jb.setFont(new Font("나눔고딕", Font.BOLD, 25));
  				jb.requestFocus();
  				result.add(jb,BorderLayout.SOUTH);

 
  				
  				
  				
  				link.put("국어국문학과",	"http://www.jejunu.ac.kr/colleges/humanities/korean"	);
  				link.put("영어영문학과",	"http://www.jejunu.ac.kr/colleges/humanities/english"	);
  				link.put("일어일문학과",	"http://www.jejunu.ac.kr/colleges/humanities/japanese"	);
  				link.put("중어중문학과",	"http://www.jejunu.ac.kr/colleges/humanities/chinese"	);
  				link.put("독일학과",	"http://www.jejunu.ac.kr/colleges/humanities/ifdk"	);
  				link.put("사학과",	"http://www.jejunu.ac.kr/colleges/humanities/history"	);
  				link.put("사회학과",	"http://www.jejunu.ac.kr/colleges/humanities/sociology"	);
  				link.put("철학과",	"http://www.jejunu.ac.kr/colleges/humanities/sophia"	);
  				link.put("행정학과",	"http://www.jejunu.ac.kr/colleges/justice/admini"	);
  				link.put("정치외교학과",	"http://www.jejunu.ac.kr/colleges/justice/politics"	);
  				link.put("언론홍보학과",	"http://www.jejunu.ac.kr/colleges/justice/journalism"	);
  				link.put("경영학과",	"http://www.jejunu.ac.kr/colleges/biz/dba"	);
  				link.put("관광경영학과",	"http://www.jejunu.ac.kr/colleges/biz/tourism"	);
  				link.put("회계학과",	"http://www.jejunu.ac.kr/colleges/biz/accounting"	);
  				link.put("무역학과",	"http://www.jejunu.ac.kr/colleges/biz/trade"	);
  				link.put("경제학과",	"http://www.jejunu.ac.kr/colleges/biz/econ"	);
  				link.put("관광개발학과",	"http://www.jejunu.ac.kr/colleges/biz/td"	);
  				link.put("경영정보학과",	"http://www.jejunu.ac.kr/colleges/biz/mis"	);
  				link.put("국어교육과",	"http://www.jejunu.ac.kr/colleges/education/koredu"	);
  				link.put("영어교육과",	"http://www.jejunu.ac.kr/colleges/education/engedu"   	);
  				link.put("윤리교육과",	"http://www.jejunu.ac.kr/colleges/education/ethics"	);
  				link.put("일반사회교육과",	"http://www.jejunu.ac.kr/colleges/education/sse"	);
  				link.put("지리교육과",	"http://www.jejunu.ac.kr/colleges/education/jejugeo"	);
  				link.put("수학교육과",	"http://www.jejunu.ac.kr/colleges/education/mathedu"	);
  				link.put("컴퓨터교육과",	"http://www.jejunu.ac.kr/colleges/education/educom"	);
  				link.put("생물교육전공",	"http://www.jejunu.ac.kr/colleges/education/bioedu"	);
  				link.put("물리교육전공",	"http://www.jejunu.ac.kr/colleges/education/phys"	);
  				link.put("체육교육과",	"http://www.jejunu.ac.kr/colleges/education/phyeducation"	);
  				link.put("식물자원환경전공",	"http://www.jejunu.ac.kr/colleges/todaud/plant"	);
  				link.put("원예환경전공",	"http://www.jejunu.ac.kr/colleges/todaud/hort"	);
  				link.put("바이오소재전공",	"http://www.jejunu.ac.kr/colleges/todaud/appbio"	);
  				link.put("분자생명공학전공",	"http://www.jejunu.ac.kr/colleges/todaud/mobio"	);
  				link.put("동물생명공학전공",	"http://www.jejunu.ac.kr/colleges/todaud/animal"	);
  				link.put("산업응용경제학과",	"http://www.jejunu.ac.kr/colleges/todaud/iae"	);
  				link.put("해양생명과학과",	"http://www.jejunu.ac.kr/colleges/ocean/mls"	);
  				link.put("수산생명의학과",	"http://www.jejunu.ac.kr/colleges/ocean/alm"	);
  				link.put("해양산업경찰학과",	"http://www.jejunu.ac.kr/colleges/ocean/dmie"	);
  				link.put("지구해양과학과",	"http://www.jejunu.ac.kr/colleges/ocean/ems"	);
  				link.put("환경공학과",	"http://www.jejunu.ac.kr/colleges/ocean/dee"	);
  				link.put("토목공학과",	"http://www.jejunu.ac.kr/colleges/ocean/dce"	);
  				link.put("해양시스템공학과",	"http://www.jejunu.ac.kr/colleges/ocean/ose"	);
  				link.put("물리학과",	"http://www.jejunu.ac.kr/colleges/ns/physics"	);
  				link.put("생물학과",	"http://www.jejunu.ac.kr/colleges/ns/lifescience"	);
  				link.put("화학코스메틱스학과",	"http://www.jejunu.ac.kr/colleges/ns/chem"	);
  				link.put("식품영양학과",	"http://www.jejunu.ac.kr/colleges/ns/foodnutrition"	);
  				link.put("수학과",	"http://www.jejunu.ac.kr/colleges/ns/math"	);
  				link.put("전산통계학과",	"http://www.jejunu.ac.kr/colleges/ns/jupiter"	);
  				link.put("아동생활복지전공",	"http://www.jejunu.ac.kr/colleges/ns/humanwelfare"	);
  				link.put("주거가족복지전공",	"http://www.jejunu.ac.kr/colleges/ns/familywelfare"	);
  				link.put("패션의류학과",	"http://www.jejunu.ac.kr/colleges/ns/cnt"	);
  				link.put("체육학과",	"http://www.jejunu.ac.kr/colleges/ns/jejusports"	);
  				link.put("식품생명공학과",	"http://www.jejunu.ac.kr/colleges/engr/foodse"	);
  				link.put("기계공학전공",	"http://www.jejunu.ac.kr/colleges/engr/mecha"	);
  				link.put("메카트로닉스공학전공",	"http://www.jejunu.ac.kr/colleges/engr/mechatronics"	);
  				link.put("전파정보통신공학전공",	"http://www.jejunu.ac.kr/colleges/engr/telecom"	);
  				link.put("에너지공학전공",	"http://www.jejunu.ac.kr/colleges/engr/energy"	);
  				link.put("컴퓨터공학전공",	"http://www.jejunu.ac.kr/colleges/engr/ce"	);
  				link.put("전자공학전공",	"http://www.jejunu.ac.kr/colleges/engr/comdol"	);
  				link.put("전기공학전공",	"http://www.jejunu.ac.kr/colleges/engr/ee"	);
  				link.put("생명화학전공",	"http://www.jejunu.ac.kr/colleges/engr/chemeng"	);
  				link.put("건축공학전공",	"http://www.jejunu.ac.kr/colleges/engr/archieng"	);
  				link.put("건축학전공",	"http://www.jejunu.ac.kr/colleges/engr/archidesign"	);
  				link.put("의예과",	"http://www.jejunu.ac.kr/colleges/cm/premedicalscience"	);
  				link.put("초등교육과",	"http://www.jejunu.ac.kr/colleges/sara"	);
  				link.put("수의예과",	"http://www.jejunu.ac.kr/colleges/veterinary/preveter"	);
  				link.put("간호학과",	"http://www.jejunu.ac.kr/colleges/cnursing/nursing"	);
  				link.put("음악학부",	"http://www.jejunu.ac.kr/colleges/artsndesign/music"	);
  				link.put("미술학부",	"http://www.jejunu.ac.kr/colleges/artsndesign/fineart"	);
  				link.put("멀티미디어디자인전공",	"http://www.jejunu.ac.kr/colleges/artsndesign/multi"	);
  				link.put("문화조형디자인전공",	"http://www.jejunu.ac.kr/colleges/artsndesign/culture"	);
  				link.put("건강뷰티향장학과",	"http://www.jejunu.ac.kr/colleges/fc/beauty"	);
  				link.put("실버케어복지학과",	"http://www.jejunu.ac.kr/colleges/fc/silverwelfare"	);
  				link.put("관광융복합학과",	"http://www.jejunu.ac.kr/colleges/fc/tc"	);
  				link.put("부동산관리학과",	"http://www.jejunu.ac.kr/colleges/fc/realestate"	);
  				link.put("약학과",	"http://www.jejunu.ac.kr/colleges/pharmacology/pharmacy"	);

 				jb.addActionListener(new ActionListener() {
				       public void actionPerformed(ActionEvent e) {
				    	   String url = "";
			  				url = link.get(major);

							 Runtime runtime = Runtime.getRuntime();
						        try {
						            runtime.exec("explorer.exe " + url);
						        } catch (IOException ex) {
						        }  
			  				
				       }
				});
  				
  				//JScrollPane jScrollPane = new JScrollPane();//스크롤팬 생성
  				//jScrollPane.setViewportView(result);//스크롤 팬 위에 패널을 올린다.  			
  				
				//result.add(new JScrollPane(???));
  				
  				result.add(resultText,BorderLayout.NORTH);
  				setContentPane(result);
  				setVisible(true);
  				cur++;

  				return;

  			}
  			cur++;
  			
			btn[0].setText(str.get(cur*3));
			btn[1].setText(str.get(cur*3+1));
  			btn[2].setText(str.get(cur*3+2));
		}
		@Override
		public void mouseEntered(MouseEvent e) { // 버튼 위 마우스
			JButton Tempbtn = (JButton)e.getSource();
			Tempbtn.setBackground(new Color(230,230,255));
			
		}
		@Override
		public void mouseExited(MouseEvent e) { // 버튼 밖 마우스
			JButton Tempbtn = (JButton)e.getSource();
			Tempbtn.setBackground(new Color(196,222,255));
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		new jest1();
		
		int j = 0;
		
		 try{
	            //파일 객체 생성
	            File file = new File("./DB/test.txt");
	            //입력 스트림 생성
	            FileReader filereader = new FileReader(file);
	            //입력 버퍼 생성
	            BufferedReader bufReader = new BufferedReader(filereader);
	            String line = "";
	            while((line = bufReader.readLine()) != null){
	                
	                str.add(j,line);
	                j++;
	            }
	            //.readLine()은 끝에 개행문자를 읽지 않는다.            
	            bufReader.close();
	        }catch (FileNotFoundException e) {
	            // TODO: handle exception
	        }catch(IOException e){
	            System.out.println(e);
	        }
			btn[0].setText(str.get(0));
	  		btn[1].setText(str.get(1));
	  		btn[2].setText(str.get(2));


	  		
	}
}