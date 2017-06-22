import java.util.*;

public class P139_4 {
    public static void main(String args[]) {
        System.out.print(shortPathString("/42/nope/nope"));
    }

    public static String shortPathString(String path) {

        if (path.trim().equals(""))
            return path;
        Deque<String> pathNames = new LinkedList<>();

        if(path.startsWith("/")){
            pathNames.addFirst("/"); 
        }

        for (String token: path.split("/")){
            if (token.equals("..")){
                if (pathNames.isEmpty() || pathNames.peekFirst().equals("..")){
                    pathNames.addFirst(token);
                } else {
                    if (pathNames.peekFirst().equals("/")){
                        System.out.println("Error"); 
                    }
                    pathNames.removeFirst();
                }
            } else if (!token.equals(".") && !token.isEmpty()){
                pathNames.addFirst(token);
            }
        }

        StringBuilder result = new StringBuilder();
        // Why use Iterator on the Book if peekLast and pollLast is O(1) anyways?
        while(!pathNames.isEmpty()){
            String last = pathNames.pollLast();
            result.append(last);
            if(!pathNames.isEmpty() && !last.equals("/"))
                result.append("/");
            //Iterator<String> it = pathNames.descendingIterator();
            //String prev = it.next();
            //result.append(prev);
            //while (it.hasNext()){
            //if (!prev.equals("/")){
            //result.append("/");
            //}
            //prev = it.next();
            //result.append(prev);
            //}
        }
        return result.toString();
    }
}
