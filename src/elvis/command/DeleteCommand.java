package elvis.command;

import elvis.operation.TaskList;
import elvis.operation.Ui;

/**
 * Command class for deleting task in TaskList
 */
public class DeleteCommand extends Command {
    /**
     * Deletes task in the TaskList
     *
     * @param numberInput
     */
    public static void taskRemover(int numberInput) {
        int nthTask = numberInput - 1;
        int arraySize = TaskList.getArraySize();
        if (nthTask >= arraySize || nthTask < 0 || TaskList.isArrayEmpty()) {
            Ui.noSuchTaskMessagePrinter();
            return;
        }
        Ui.taskRemovedMessagePrinter();
        Ui.print(nthTask);
        TaskList.taskRemover(nthTask);
        Ui.taskCountPrinter();
    }
}
