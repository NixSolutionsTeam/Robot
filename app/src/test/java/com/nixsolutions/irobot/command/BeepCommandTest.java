package com.nixsolutions.irobot.command;

import com.nixsolutions.irobot.RobotWrapper;
import com.nixsolutions.irobot.sdk.IRobot;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class BeepCommandTest {

    private static final String MOCK_ID = "mock_id";
    @Mock
    IRobot mockRobot;
    RobotWrapper mockRobotWraper;

    @Before
    public void setUp() {
        initMocks(this);
        mockRobotWraper = new RobotWrapper(MOCK_ID, mockRobot);
    }

    @Test
    public void execute() throws Exception {
        Command command = new BeepCommand(mockRobotWraper.getId());
        command.execute(mockRobotWraper);

        verify(mockRobot).beep();
    }

}