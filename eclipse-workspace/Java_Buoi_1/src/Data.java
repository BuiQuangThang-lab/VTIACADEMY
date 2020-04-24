import java.util.Date;
public class Data {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// logic

        // Create Department
		
		Department department1 = new Department();
		department1.id = 2;
		department1.name = "Sale";
		
		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Maketting";
		
		
		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Financial";
		
		// Create position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = "Chairman";
		
		Position position2 = new Position();
		position2.id = 2;
		position2.name = "Director";
		
		Position position3 = new Position();
		position3.id = 3;
		position3.name = "Manager";	
		
		// Create account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "Buithang220398@gmail.com";
		account1.userName = "BuiThang";
		account1.fullName = "Bùi Quang Thắng";
		account1.position =  position2;
		account1.cretateDate = new Date("2018/02/23");
		
		Account account2 = new Account();
		account2.id = 2;
		account2.email = "ngocbich.tt@gmail.com";
		account2.userName = "NgocBich";
		account2.fullName = "Nguyễn Ngọc Bích";
		account2.position =  position1;
		account2.cretateDate = new Date("2018/04/21");
		
		Account account3 = new Account();
		account3.id = 3;
		account3.email = "maihuong.12@gmail.com";
		account3.userName = "MaiHuong";
		account3.fullName = "Trinh Mai Hương";
		account3.position =  position2;
		account3.cretateDate = new Date("2018/05/11");	
		
		Account account4 = new Account();
		account4.id = 4;
		account4.email = "Thu.ngt@gmail.com";
		account4.userName = "NguyenThu";
		account4.fullName = "Nguyễn Hoài Thu";
		account4.position =  position3;
		account4.cretateDate = new Date("2017/05/06");	

		Account account5 = new Account();
		account5.id = 5;
		account5.email = "Duy.nq@gmail.com";
		account5.userName = "QuangDuy";
		account5.fullName = "Nguyễn Quang Duy";
		account5.position =  position1;
		account5.cretateDate = new Date("2017/11/06");	
		
		Account account6 = new Account();
		account6.id = 6;
		account6.email = "Nga.mc@gmail.com";
		account6.userName = "MacNga";
		account6.fullName = "Lý Thu Nga";
		account6.position =  position3;
		account6.cretateDate = new Date("2017/08/06");
		
		// Create group;
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Avengers";
		group1.creator = account1;
		
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Avengers";
		group2.creator = account2;
		
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Avengers";
		group3.creator = account3;
		
		Group group4 = new Group();
		group4.id = 4;
		group4.name = "Avengers";
		group4.creator = account4;
		
		
		Account[] accountOfDepartment1 = {account1,account2};
		department1.employees = accountOfDepartment1;
		
		Account[] accountOfDepartment2 = {account3,account4};
		department2.employees = accountOfDepartment2;
		
		Account[] accountOfDepartment3 = {account5,account6};
		department3.employees = accountOfDepartment3;

		Group[] groupOfAccount1 = {group1, group2};
		account1.groups = groupOfAccount1;
		
		Group[] groupOfAccount2 = {group1};
		account2.groups = groupOfAccount2;
		
		Group[] groupOfAccount3 = {group1, group3};
		account3.groups = groupOfAccount3;
		
		Group[] groupOfAccount4 = {group4};
		account4.groups = groupOfAccount4;
		
		Group[] groupOfAccount5 = {group2,group3};
		account5.groups = groupOfAccount5;
		
		Group[] groupOfAccount6 = {group4};
		account5.groups = groupOfAccount6;
		
		
		Account[] accountOfGroup1 = {account1,account2,account3};
		group1.participants = accountOfGroup1;
		
		Account[] accountOfGroup2 = {account1,account5};
		group2.participants = accountOfGroup2;
		
		Account[] accountOfGroup3 = {account3,account5};
		group3.participants = accountOfGroup3;
		
		Account[] accountOfGroup4 = {account4,account6};
		group4.participants = accountOfGroup4;
		
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.id = 1;
		typeQuestion1.name = type.ESSAY;
		
		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.id = 2;
		typeQuestion2.name = type.MULTIPLECHOICE;
		
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.id = 1;
		categoryQuestion1.name = "Java";
		
		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.id = 2;
		categoryQuestion2.name = "C++";
			
		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.id = 3;
		categoryQuestion3.name = "SQL";
		
		CategoryQuestion categoryQuestion4 = new CategoryQuestion();
		categoryQuestion4.id = 4;
		categoryQuestion4.name = "Postmen";
		
		Question question1 = new Question();
		question1.id = 1;
		question1.name = "Thiết kế font-end cho web bán hàng online";
		question1.category = categoryQuestion1;
		question1.creator = account1;
		question1.createDate = new Date("2020/10/20");
		question1.type = typeQuestion1;
		
		Question question2 = new Question();
		question2.id = 2;
		question2.name = "Chọn đáp án đúng cho những phát biểu về C++ sau";
		question2.category = categoryQuestion2;
		question2.creator = account2;
		question2.createDate = new Date("2020/11/20");
		question2.type = typeQuestion2;
		
		Question question3 = new Question();
		question3.id = 3;
		question3.name = "Cho biết phát biểu sau đúng hay sai?";
		question3.category = categoryQuestion3;
		question3.creator = account3;
		question3.createDate = new Date("2020/9/20");
		question3.type = typeQuestion2;
		
		Question question4 = new Question();
		question4.id = 4;
		question4.name = "Cho biết phát biểu sau đúng hay sai?";
		question4.category = categoryQuestion3;
		question4.creator = account3;
		question4.createDate = new Date("2020/9/20");
		question4.type = typeQuestion2;
		
		Question question5 = new Question();
		question5.id = 5;
		question5.name = "Thiết kế postmen";
		question5.category = categoryQuestion4;
		question5.creator = account4;
		question5.createDate = new Date("2020/9/20");
		question5.type = typeQuestion1;
		
		Answer answer1 = new Answer();
		answer1.id = 1;
		answer1.question = question1;
		answer1.content = "Một trang Web";
		answer1.isCorrect = true;
		
		Answer answer2 = new Answer();
		answer2.id = 2;
		answer2.question = question2;
		answer2.content = "abc Đúng";
		answer2.isCorrect = false;
		
		Answer answer3 = new Answer();
		answer3.id = 3;
		answer3.question = question3;
		answer3.content = "1:Sai,2:Đúng";
		answer3.isCorrect = false;
		
		Answer answer4 = new Answer();
		answer4.id = 4;
		answer4.question = question4;
		answer4.content = "acd Đúng";
		answer4.isCorrect = false;
		
		Answer answer5 = new Answer();
		answer5.id = 5;
		answer5.question = question5;
		answer5.content = "1 postman";
		answer5.isCorrect = true;
		
		Exam exam1 = new Exam();
		exam1.id = 1;
		exam1.code = 102;
		exam1.category = categoryQuestion1;
		exam1.title = "Lập trình web";
		exam1.duration = 60;
		exam1.creator = account4;
		exam1.createDate = new Date(2020/11/11);
		
		Exam exam2 = new Exam();
		exam2.id = 2;
		exam2.code = 111;
		exam2.category = categoryQuestion2;
		exam2.title = "C++ cơ bản";
		exam2.duration = 90;
		exam2.creator = account5;
		exam2.createDate = new Date(2020/10/01);
		
		Exam exam3 = new Exam();
		exam3.id = 3;
		exam3.code = 001;
		exam3.category = categoryQuestion3;
		exam3.title = "cơ sở dữ liệu";
		exam3.duration = 120;
		exam3.creator = account4;
		exam3.createDate = new Date(2020/01/02);
		
		Exam[] questionInExam1 = {exam1, exam2};
		question1.exams = questionInExam1;
		
		Exam[] questionInExam2 = {exam1, exam3};
		question2.exams = questionInExam2;
		
		Exam[] questionInExam3 = {exam2, exam3};
		question3.exams = questionInExam3;
		
		Exam[] questionInExam4 = {exam3};
		question4.exams = questionInExam4;
		
		Exam[] questionInExam5 = {exam1, exam2};
		question5.exams = questionInExam5;
		
		Question[] examHaveQuestion1 = {question1,question2,question5};
		exam1.questions = examHaveQuestion1;
		
		Question[] examHaveQuestion2 = {question2,question3,question5};
		exam2.questions = examHaveQuestion2;
		
		Question[] examHaveQuestion3 = {question2,question3,question4};
		exam3.questions = examHaveQuestion3;
		
		// truy_vấn_dữ_liệu
		// phòng_ban
		System.out.println("Thông tin phòng ban 1:");     
	    System.out.println("name: " + department1.name);
	    System.out.println("id: " + department1.id);
	    //-----------------------------------------------------//
	    System.out.println("\n");
	    // Chức_vụ
	    System.out.println("Thông tin chức vụ 1:");
	    System.out.println("name: " + position1.name);
	    System.out.println("id" + position1.id);
	    //-----------------------------------------------------//
	    System.out.println("\n");
	    // Tài_khoản
	    System.out.println("name:" + account1.fullName);
	    System.out.println("Thuộc group:" + account1.groups);
	    //-----------------------------------------------------//
	    System.out.println("\n");
	    // Group
	    System.out.println("name: " + group1.name);
	    System.out.println(group1.participants);
	    
	}
}

   
     
     
