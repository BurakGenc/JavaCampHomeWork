package kodlamaIo;

public class UserManager {
	public void add(User user) {

		System.out.println(user.getFirsName() + " adlı Kullanıcı Başarıyla kayıt oldu");

	}

	public void SignIn(User user) {

		System.out.println(user.getFirsName() + " adlı Kullanıcı giriş yaptı");

	}

	public void logOut(User user) {

		System.out.println(user.getFirsName() + " adlı Kullanıcı çıkış yaptı");

	}

	public void delete(User user) {
		System.out.println(user.getFirsName() + " adlı Kullanıcı Başarıyla silindi");
	}
}
