package prob05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LoginMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<User> joinUsers = new ArrayList<User>();
		joinUsers.add( new User( "john", "1234") );
		
		System.out.println("아이디를 입력하시오 : ");
		String id = scanner.nextLine();
		
		System.out.println("비밀번호를 입력하시오 : ");
		String password = scanner.nextLine();
		
		try {
			login(joinUsers, new User(id, password));
		} catch(UserNotFoundException e) {
			System.out.println("사용자를 찾을 수 없습니다.");
		}catch (PasswordDismatchException e) {
			System.out.println("비밀번호를 찾을 수 없습니다.");
		}
		

	}
	
	public static void login(List<User> users, User user ) throws UserNotFoundException, PasswordDismatchException {
		if( !users.contains(user) ){
			throw new UserNotFoundException();
		}
		
		User savedUser = users.get( users.indexOf( user ) );
		
		if( !savedUser.getPassword().equals( user.getPassword()) ){
			throw new PasswordDismatchException();
		}
		
		if(savedUser.getPassword().equals( user.getPassword()) && savedUser.getId().equals( user.getId())) {
			
			System.out.println("로그인 성공");
		}
		
	
		
	}
}

class UserNotFoundException extends Exception{

	public UserNotFoundException() {
		super("사용자를 찾을 수 없습니다.");
		// TODO Auto-generated constructor stub
	}
	
	
	
}



class PasswordDismatchException  extends Exception{

	public PasswordDismatchException () {
		super("비밀번호를 찾을 수 없습니다.");
		// TODO Auto-generated constructor stub
	}
	
	
	
}