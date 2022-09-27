library(baseballr)
library(tidyverse)
library(dplyr)


MikeTroutTable <- read_csv('/Users/nolenconner/Desktop/Project/R/FangraphsTest/TroutFangraphs.csv')
HitterPlus2019 <- read_csv('/Users/nolenconner/Desktop/Project/R/FangraphsTest/HittingPlusLeaderboard2019.csv')
FangraphsHitterData <-  read_csv('/Users/nolenconner/Desktop/Project/R/FangraphsTest/FanGraphsLeaderboard.csv')


MikeTroutHitterPlus2019 <-HitterPlus2019[1, ]
MikeTroutSeaonStats2019 <- MikeTroutTable[9, ]
colnames(MikeTroutSeaonStats2019)[20] <- "wrcPlus"
colnames(FangraphsHitterData)[20] <- "wrcPlus"

WrcPlus2019 <- arrange(FangraphsHitterData, desc(wrcPlus))
#MikeTroutName <- data_frame("Mike Trout")
#colnames(MikeTroutName)[1] <- "Name"
WrcPlusPercentile <- function(WrcPlus){
  Percentile = ((nrow(WrcPlus2019) - (which(WrcPlus2019$wrcPlus == WrcPlus))) / nrow(WrcPlus2019)) * 100
  #Percentile = ecdf(WrcPlus2019$wrcPlus)(WrcPlus2019$wRC)
  return (Percentile)
  
}


MikeTroutHitterQuality <- data.frame(((MikeTroutHitterPlus2019[ , "Hitting+ Percentile"] * 100) + WrcPlusPercentile(177)) / 2)
colnames(MikeTroutHitterQuality)[1] <- "HitterQuality"



MikeTroutFangraphsExport <- data.frame(MikeTroutSeaonStats2019, MikeTroutHitterQuality)
MikeTroutFangraphsExport$Off <-  NULL
MikeTroutFangraphsExport$Def <-  NULL
MikeTroutFangraphsExport$Off <-  NULL
MikeTroutFangraphsExport$BsR <-  NULL
MikeTroutFangraphsExport$wOBA <-  NULL
MikeTroutFangraphsExport$xwOBA <-  NULL
MikeTroutFangraphsExport$BABIP <-  NULL
MikeTroutFangraphsExport$ISO <-  NULL
MikeTroutFangraphsExport$WAR <-  NULL

view(MikeTroutFangraphsExport)
view(MikeTroutHitterPlus2019)
view(WrcPlus2019)
view(MikeTroutHitterQuality)
#write.csv(MikeTroutFangraphsExport, file = "/Users/nolenconner/Desktop/Project/Master/data/MikeTroutSeaonStats2019.csv")
#write.csv(MikeTroutFangraphsExport, file = "/Users/nolenconner/Desktop/Project/MikeTroutSeaonStats2019two.csv")

