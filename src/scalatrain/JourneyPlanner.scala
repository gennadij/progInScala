

class JourneyPlanner(trains: Set[Train]) {
  require(trains != null, "trains must not be null")
  //TODO Logger
  
  val stations: Set[Station] = trains flatMap { _.stations }
  
  def trains(station: Station): Set[Train] = {
    require(station != null, "station must not be null")
    
    trains filter { _.stations contains station }
  }
  
  def departures(station: Station): Set[(Time, Train)] = {
    require(station != null, "station must not be null")
    
    for{
      train <- trains
      timeAndStation <- train.schedule if (timeAndStation._2 == station)
    } yield timeAndStation._1 -> train
  }
}