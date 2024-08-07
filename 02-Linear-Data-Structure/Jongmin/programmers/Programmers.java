import java.util.*;

public class Programmers {

    public int[] solution(int[] progresses, int[] speeds) {

        // 각 기능이 완료되기까지 남은 일수를 계산하는 리스트
        List<Integer> days = new ArrayList<>();

        // 각 기능의 완료 일수를 계산합니다.
        for (int i = 0; i < progresses.length; i++) {
            int remainingDays = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
            days.add(remainingDays);
        }

        // 결과를 저장할 리스트
        List<Integer> result = new ArrayList<>();

        // 첫 번째 배포 그룹의 기준일
        int deployDay = days.get(0);
        int count = 1;

        for (int i = 1; i < days.size(); i++) {
            if (days.get(i) <= deployDay) {
                // 현재 기능이 이전 기능과 같은 날 배포될 수 있는 경우
                count++;
            } else {
                // 새로운 배포 그룹 시작
                result.add(count);
                deployDay = days.get(i);
                count = 1;
            }
        }

        // 마지막 배포 그룹의 기능 개수를 추가합니다.
        // ⭐️ 여기 부분을 풀지 못했음...
        result.add(count);

        // List를 배열로 변환하여 반환
        return result.stream().mapToInt(i -> i).toArray();

    }
}