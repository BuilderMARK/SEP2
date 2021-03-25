package Database;

import shared.transferobjects.InputUser;

import java.sql.SQLException;
import java.util.List;

public interface ChatName
{
  InputUser create(int Id , String name);
  List<InputUser> getByName(String name);
  InputUser getById(int id) throws SQLException;
}

