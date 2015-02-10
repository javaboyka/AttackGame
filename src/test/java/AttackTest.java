import org.junit.Test;

//import static org.fest.assertions.api.Assertions.assertThat;


/**
 * Created by zzy on 2/11/15.
 */
public class AttackTest {

    @Test
    public void should_test_attack_once(){
        UserInfo user1 = new UserInfo();
        user1.user_name = "张三";
        user1.health_point = 100.0f;
        user1.attack_value = 10.0f;

        UserInfo user2 = new UserInfo();
        user2.user_name = "李四";
        user2.health_point = 100.0f;
        user2.attack_value = 10.0f;

        Attack attack = new Attack();

//        assertThat(attack.attack(user1, user2).health_point).isEqualTo(90);
    }

    @Test
    public void should_test_attack_more(){

    }
}
