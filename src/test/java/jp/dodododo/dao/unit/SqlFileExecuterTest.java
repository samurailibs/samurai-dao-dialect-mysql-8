package jp.dodododo.dao.unit;

import java.sql.Connection;

import org.junit.Rule;
import org.junit.Test;

public class SqlFileExecuterTest {

	@Rule
	public DbTestRule dbTestRule = new DbTestRule();

	@Test
	public void testExecuteSelect() {
		SqlFileExecuter executer = new SqlFileExecuter(getConnection());
		String sqlFilePath = "jp/dodododo/dao/impl/many_to_one.sql";
		executer.executeSelect(sqlFilePath);

		sqlFilePath = "jp/dodododo/dao/impl/nest_if3.sql";
		executer.executeSelect(sqlFilePath);
	}

	@Test
	public void testExecuteUpdate() {
		SqlFileExecuter executer = new SqlFileExecuter(getConnection());
		String sqlFilePath = "jp/dodododo/dao/unit/insert.sql";
		executer.executeUpdate(sqlFilePath);
	}

	private Connection getConnection() {
		return dbTestRule.getConnection();
	}
}
