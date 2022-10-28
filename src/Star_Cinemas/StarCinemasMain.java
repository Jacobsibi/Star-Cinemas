package Star_Cinemas;

/**
 *
 * @author jacob.s
 */
public class StarCinemasMain {

    public static void main(String[] args) {

        /**
         * Opens login form to use Star Cinemas Employee/Admin system 
         * It is also possible to run program from StarCinemasMainSplash which 
         * prompts a loading splash screen first before Login screen. 
         */
        Login login = new Login();
        login.setVisible(true);

    }
}
