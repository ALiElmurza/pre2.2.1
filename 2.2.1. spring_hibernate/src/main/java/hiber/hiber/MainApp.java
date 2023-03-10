package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);
//
//      User user1 = new User("User1", "Lastname1", "user1@mail.ru");
//      User user2 = new User("User2", "Lastname2", "user2@mail.ru");
//      User user3 = new User("User3", "Lastname3", "user3@mail.ru");
//      User user4 = new User("User3", "Lastname3", "user3@mail.ru");
//
//      Car car1 = new Car(user1,"Ferrari", 488);
//      Car car2 = new Car(user2,"Ferrari", 812);
//      Car car3 = new Car(user3,"Ferrari", 360);
//      Car car4 = new Car(user4,"Ferrari", 250);
//
//      user1.setCar(car1);
//      user2.setCar(car2);
//      user3.setCar(car3);
//      user4.setCar(car4);
//
//      userService.add(user1);
//      userService.add(user2);
//      userService.add(user3);
//      userService.add(user4);
//
//
//      List<User> users = userService.listUsers();
//      for (User user : users) {
//         System.out.println(user.toString());
//         System.out.println();
//      }


      User user = userService.getUserByModel("Ferrari", 250);

      System.out.println(user.getCar().getSeries());
      System.out.println(user.getCar().getModel());


      context.close();
   }
}


