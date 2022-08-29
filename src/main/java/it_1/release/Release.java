package it_1.release;
import it_1.exception.NonexistentTask;
import it_1.logs.Log;
import it_1.tasks.Tasks;
import java.util.*;

public class Release {
    private Map<String, Tasks> release = new HashMap<>();

    public void addTasks(Tasks task) {
        release.put(task.getName(), task);
    }

    public boolean existTasks(Tasks task) {
       return release.containsKey(task.getName());
    }

    public void finishTask(Tasks task) {
        try {
            if (release.containsKey(task.getName())) {
                release.remove(task.getName(), task);
            } else {
                throw new NonexistentTask();
            }
        } catch (NonexistentTask exception) {
            Log.error(exception.getMessage());
        }
    }

    public Map<String, Tasks> getRelease() {
        return release;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Release)) return false;
        Release release = (Release) o;
        return Objects.equals(release, release.release);
    }

    @Override
    public int hashCode() {
        return Objects.hash(release);
    }

    @Override
    public String toString() {
        return "Release{" +
                "realease=" + release +
                '}';
    }
}
