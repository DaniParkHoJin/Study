package view;

import controller.LessonRegisterManager;
import controller.StudentRegisterManager;
import controller.SubjectRegisterManager;
import controller.TraineeRegisterManager;

public class UniversityRegisterCoursesMain {

	public static void main(String[] args) {
		mainMenu();
	}

	private static void mainMenu() {
		int choiceNum;
		try {
			MenuViewer.mainMenuView();
			choiceNum = MenuViewer.choice.nextInt();
			MenuViewer.choice.nextLine();

			switch (choiceNum) {
			case MENU_CHOICE.SUBJECT:
				subjectMenu();
				break;
			case MENU_CHOICE.STUDENT:
				studentMenu();
				break;
			case MENU_CHOICE.LESSON:
				lessonMenu();
				break;
			case MENU_CHOICE.TRAINEE:
				traineeMenu();
				break;
			default:
				break;
			}
		} catch (Exception e) {
			System.out.println("\n입력에 오류가 있습니다.\n 프로그램을 다시 시작하세요.");
			return;
		}

	}

	// 수강 신청 메뉴
	private static void traineeMenu() {
		int choice;
		TraineeRegisterManager traineeManager = new TraineeRegisterManager();
		MenuViewer.traineeMenuView();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case TRAINEE_CHOICE.LIST:
			traineeManager.traineeList();
			System.out.println("");
			break;
		case TRAINEE_CHOICE.INSERT:
			System.out.println("");
			traineeManager.traineeInsert();
			break;
		case TRAINEE_CHOICE.DELETE:
			System.out.println("");
			traineeManager.traineeDelete();
			break;
		case TRAINEE_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

	// 과목 메뉴
	private static void lessonMenu() {
		int choice;
		LessonRegisterManager lessonManager = new LessonRegisterManager();
		MenuViewer.lessonMenuView();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case LESSON_CHOICE.LIST:
			System.out.println("");
			lessonManager.lessonList();
			break;
		case LESSON_CHOICE.INSERT:
			System.out.println("");
			lessonManager.lessonInsert();
			break;
		case LESSON_CHOICE.UPDATE:
			System.out.println("");
			lessonManager.lessonUpdate();
			break;
		case LESSON_CHOICE.DELETE:
			System.out.println("");
			lessonManager.lessonDelete();
			break;
		case LESSON_CHOICE.MAIN:
			return;

		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

	// 학생 메뉴
	private static void studentMenu() throws Exception{

		int choice;

		StudentRegisterManager studentManager = new StudentRegisterManager();
		MenuViewer.studnetMenuView();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case STUDENT_CHOICE.INSERT:
			System.out.println("");
			studentManager.studentRegistr();// 학생 정보 입력
			break;
		case STUDENT_CHOICE.UPDATE:
			System.out.println("");
			studentManager.studentUpdate(); // 학생 정보 수정
			break;
		case STUDENT_CHOICE.LIST:
			System.out.println("");
			studentManager.studentList(); // 학생 전체 목록
			break;
		case STUDENT_CHOICE.MAIN: // 메인 메뉴
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}

	}

	// 학과 메뉴
	private static void subjectMenu() throws Exception {
		int choice;

		SubjectRegisterManager subjectManager = new SubjectRegisterManager();
		MenuViewer.sujectMenuView();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case SUBJECT_CHOICE.LIST:
			System.out.println("");
			subjectManager.subjectList();
			break;
		case SUBJECT_CHOICE.INSERT:
			System.out.println("");
			subjectManager.subjectInsert();
			break;
		case SUBJECT_CHOICE.UPDATE:
			System.out.println("");
			subjectManager.subjectUpdate();
			break;
		case SUBJECT_CHOICE.DELETE:
			System.out.println("");
			subjectManager.subjectDelete();
			break;
		case SUBJECT_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}

	}

}
