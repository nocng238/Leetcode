package LinkedList;
import java.io.*;
import java.util.*;
public class ListNode {
    public static void main(String[] args) {
        /* Total number of processors or cores available to the JVM */
        System.out.println("Available processors (cores): " +
                Runtime.getRuntime().availableProcessors());
//        System.out.println("Process: "+ Process.);

        /* Total amount of free memory available to the JVM */
        System.out.println("Free memory (bytes): " +
                Runtime.getRuntime().freeMemory());

        /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
        /* Maximum amount of memory the JVM will attempt to use */
        System.out.println("Maximum memory (bytes): " +
                (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));

        /* Total memory currently available to the JVM */
        System.out.println("Total memory available to JVM (bytes): " +
                Runtime.getRuntime().totalMemory());

        /* Get a list of all filesystem roots on this system */
        File[] roots = File.listRoots();

        /* For each filesystem root, print some info */
        for (File root : roots) {
            System.out.println("File system root: " + root.getAbsolutePath());
            System.out.println("Total space (bytes): " + root.getTotalSpace());
            System.out.println("Free space (bytes): " + root.getFreeSpace());
            System.out.println("Usable space (bytes): " + root.getUsableSpace());
        }
    }
        public static float getCpuClockSpeed() {
            float cpuclock = 0;
            try {
                final StringBuffer s = new StringBuffer();
                final Process p = Runtime.getRuntime()
                        .exec("cat /proc/cpuinfo");
                final BufferedReader input = new BufferedReader(
                        new InputStreamReader(p.getInputStream()));
                String line = "";
                while ((line = input.readLine()) != null
                        && s.toString().length() == 0) {
                    if (line.startsWith("BogoMIPS")) {
                        s.append(line + "\n");
                    }
                }
                final String cpuclockstr = s.substring(s.indexOf(":") + 2,
                        s.length());
                cpuclock = Float.parseFloat(cpuclockstr);
            } catch (final Exception err) {
                // if ANYTHING goes wrong, just report 0 since this is only used for
                // performance appraisal.
            }
            return cpuclock;
        }
    public static String getCpuMinFreq() {
        String result = "N/A";
        ProcessBuilder cmd;
        try {
            String[] args = { "/system/bin/cat",
                    "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq" };
            cmd = new ProcessBuilder(args);
            Process process = cmd.start();
            InputStream in = process.getInputStream();
            byte[] re = new byte[24];
            while (in.read(re) != -1) {
                result = result + new String(re);
            }
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return result.trim();
    }
    }

