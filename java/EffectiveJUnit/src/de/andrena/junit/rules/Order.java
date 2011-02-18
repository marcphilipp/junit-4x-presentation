package de.andrena.junit.rules;

import static java.lang.System.out;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.rules.MethodRule;

public class Order {
	@Rule public MethodRule rule = new ExternalResource() {
      @Override protected void before() { out.println("@Rule before"); }
      @Override protected void after()  { out.println("@Rule after");  }
	};
	@Before public void before()         { out.println("  @Before");    }
	@Test public void test()             { out.println("    @Test");    }
	@After public void after()           { out.println("  @After");     }
}
