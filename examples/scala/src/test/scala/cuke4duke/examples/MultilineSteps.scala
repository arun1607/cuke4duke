package cuke4duke.examples

import org.junit.Assert.assertEquals
import cuke4duke._

class MultilineSteps extends ScalaDsl with EN {
  Given("^I have a table:$") { table: Table =>
    assertEquals("1", table.hashes().get(0).get("foo"))
    assertEquals("4", table.hashes().get(1).get("bar"))
  }

  Given("^I have a string:$") { string: String =>
    assertEquals("foo\nbar", string)
  }
}