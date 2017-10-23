package org.carreiro.pointrankings

import org.scalatest.{FreeSpec, Matchers}

final class ScheduleTest
  extends FreeSpec
    with Matchers {

  "There are 17 weeks" in {
    Schedule.games.size should ===(17)
  }

  "Week numbers are 1 to 17" in {
    for (week <- 1 to 17) {
      Schedule.games.get(week).isDefined should ===(true)
    }
  }

  "Games per week" in {
    val byeWeeks = Map(
      4 -> 1,
      5 -> 2,
      6 -> 1,
      7 -> 1,
      8 -> 3,
      9 -> 3,
      10 -> 2,
      11 -> 2,
      13 -> 1
    )

    for ((week, games) <- Schedule.games) {
      val baseGames = Teams.nfl.size / 2
      byeWeeks.get(week) match {
        case None => games.size should ===(baseGames)
        case Some(byes) => games.size should ===(baseGames - byes)
      }
    }
  }

}
