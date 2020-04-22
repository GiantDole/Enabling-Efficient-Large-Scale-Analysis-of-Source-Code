package unused_failed;

import java.util.List;

import dao.AttributePair;

public interface DatabaseQuery {

	void constructQuery(String label, List<AttributePair> attributes);
}
