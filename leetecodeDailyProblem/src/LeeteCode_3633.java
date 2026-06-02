public class LeeteCode_3633 {
    public int earliestFinishTime(int[] landStartTime,
                                  int[] landDuration,
                                  int[] waterStartTime,
                                  int[] waterDuration) {

        int answer = Integer.MAX_VALUE;

        // Try every Land Ride
        for (int land = 0; land < landStartTime.length; land++) {

            // Try every Water Ride
            for (int water = 0; water < waterStartTime.length; water++) {

                /*
                 * OPTION 1:
                 * Land -> Water
                 */

                // Finish time of land ride
                int landFinish =
                        landStartTime[land] + landDuration[land];

                // Water ride can start either when:
                // 1. Land ride finishes
                // 2. Water ride opens
                int waterBegin =
                        Math.max(landFinish,
                                waterStartTime[water]);

                // Total finish time for Land -> Water
                int finish1 =
                        waterBegin + waterDuration[water];



                /*
                 * OPTION 2:
                 * Water -> Land
                 */

                // Finish time of water ride
                int waterFinish =
                        waterStartTime[water] + waterDuration[water];

                // Land ride can start either when:
                // 1. Water ride finishes
                // 2. Land ride opens
                int landBegin =
                        Math.max(waterFinish,
                                landStartTime[land]);

                // Total finish time for Water -> Land
                int finish2 =
                        landBegin + landDuration[land];


                // Keep the minimum answer
                answer = Math.min(answer,
                        Math.min(finish1, finish2));
            }
        }

        return answer;
    }
}
