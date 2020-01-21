import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


class ContactsManagerTest {

    ContactsManager SUT;

    @Before
    public void setup(){
       Contact Contact1 = new Contact();
       Contact1.name = "test";
        Contact1.email = "wow";
        Contact1.phoneNumber = "0696969247";
        SUT = new ContactsManager();
    }

    @Test
    public void MyFriend_Is_True(){
      Contact result = SUT.searchContact("poop");
        assertThat(result, is("test") );

    }


}