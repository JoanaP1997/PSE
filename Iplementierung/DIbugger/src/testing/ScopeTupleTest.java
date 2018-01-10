package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import dibugger.DebugLogic.Interpreter.ScopeTuple;
/**
 * 
 * @author wagner
 *
 */
public class ScopeTupleTest {
    @Test
    public void test() {
	ScopeTuple stA = new ScopeTuple(0, 0); 
	ScopeTuple stB = new ScopeTuple(5,5);
	ScopeTuple stC = new ScopeTuple(1,7);
	assert(stA.contains(0));
	for(int i = 8; i<10000; i++) {
	    assert(!stA.contains(i));
	    assert(!stC.contains(i));
	    assert(!stB.contains(i));
	}
	assert(stB.contains(5));
	assert(!stB.contains(6));
	assert(stC.contains(3));
	assert(stC.contains(1));
	assert(stC.contains(7));
    }

}
