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
			System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n ���α׷��� �ٽ� �����ϼ���.");
			return;
		}

	}

	// ���� ��û �޴�
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
			System.out.println("�ش� �޴� ��ȣ�� �Է��ϼ���.");
		}
	}

	// ���� �޴�
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
			System.out.println("�ش� �޴� ��ȣ�� �Է��ϼ���.");
		}
	}

	// �л� �޴�
	private static void studentMenu() throws Exception{

		int choice;

		StudentRegisterManager studentManager = new StudentRegisterManager();
		MenuViewer.studnetMenuView();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case STUDENT_CHOICE.INSERT:
			System.out.println("");
			studentManager.studentRegistr();// �л� ���� �Է�
			break;
		case STUDENT_CHOICE.UPDATE:
			System.out.println("");
			studentManager.studentUpdate(); // �л� ���� ����
			break;
		case STUDENT_CHOICE.LIST:
			System.out.println("");
			studentManager.studentList(); // �л� ��ü ���
			break;
		case STUDENT_CHOICE.MAIN: // ���� �޴�
			return;
		default:
			System.out.println("�ش� �޴� ��ȣ�� �Է��ϼ���.");
		}

	}

	// �а� �޴�
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
			System.out.println("�ش� �޴� ��ȣ�� �Է��ϼ���.");
		}

	}

}
