package main;

//import dao.FishDAO;
//import dto.FishDTO;
import service.FishService;

public class Main {

	public static void main(String[] args) {
		System.out.println("Fish World");
		FishService fs = new FishService();
		fs.menu();
		
		
		// dao 단위 테스트	:	DAO add 가능 테스트, 결과 : 성공
//		FishDAO f = new FishDAO();
//		FishDTO d = new FishDTO();
//		d.setId("aa");
//		d.setPwd("ppp");
//		f.add(d);
	}

}
