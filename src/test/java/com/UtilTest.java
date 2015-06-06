package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.util.MyUtil;

@RunWith(PowerMockRunner.class)
@PrepareForTest(MyUtil.class)
public class UtilTest {
	 @Test
	  public void test() {
	    PowerMockito.mockStatic(MyUtil.class);

	    PowerMockito.when(MyUtil.randomInt()).thenReturn(5);

	    System.out.println(MyUtil.randomInt());
	  }
	}