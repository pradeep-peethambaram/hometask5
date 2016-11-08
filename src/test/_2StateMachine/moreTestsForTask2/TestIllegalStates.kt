package _2StateMachine.moreTestsForTask2

//import _2StateMachine.task2.stateMachine
import org.junit.Test
import kotlin.test.assertFailsWith

open class TestIllegalStates {

    @Test
    fun onlyKnownCommand() {
        TODO()
        // uncomment the code below
//        stateMachine("START") {
//            state("START") {
//                assertFailsWith<IllegalStateException> {
//                    commands("UNKNOWN")
//                }
//            }
//        }
    }

    @Test
    fun uniqueCommands() {
        TODO()
//        stateMachine("START") {
//            command("COMMAND")
//            assertFailsWith<IllegalStateException> {
//                command("COMMAND")
//            }
//        }
    }

    @Test
    fun onlyKnownEvent() {
        TODO()
//        stateMachine("START") {
//            state("START") {
//                assertFailsWith<IllegalStateException> {
//                    transition("CYCLE", target = "START")
//                }
//            }
//        }
    }

    @Test
    fun uniqueEvents() {
        TODO()
//        stateMachine("START") {
//            event("EVENT")
//            assertFailsWith<IllegalStateException> {
//                event("EVENT")
//            }
//        }
    }


    @Test
    fun onlyKnownResetEvent() {
        TODO()
//        stateMachine("START") {
//            assertFailsWith<IllegalStateException> {
//                resetEvents("UNKNOWN")
//            }
//        }
    }

    @Test
    fun uniqueStates() {
        TODO()
//        stateMachine("START") {
//            state("START") {}
//            assertFailsWith<IllegalStateException> {
//                state("START") {}
//            }
//        }
    }

    @Test
    fun transitionOnlyToKnownStates() {
        TODO()
//        assertFailsWith<IllegalStateException> {
//            stateMachine("START") {
//                event("GO")
//                state("START") {
//                    transition("GO", target = "LAST")
//                }
//            }
//        }
    }
}