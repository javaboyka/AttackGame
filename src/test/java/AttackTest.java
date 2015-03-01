import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class AttackTest {

    @Test
    public void should_test_attack_once(){
        Player player1 = new Player();
        player1.user_name = "张三";
        player1.health_point = 100.0f;
        player1.attack_value = 10.0f;

        Player player2 = new Player();
        player2.user_name = "李四";
        player2.health_point = 100.0f;
        player2.attack_value = 10.0f;

        Attack attack = new Attack();

        assertThat(attack.attack_player(player1, player2).health_point).isEqualTo(90);
    }

    @Test
    public void should_test_attack_more(){

    }
}
