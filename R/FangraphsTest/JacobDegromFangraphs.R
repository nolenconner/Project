library(tidyverse)
library(dplyr)
JacobDegromTable <- read_csv('/Users/nolenconner/Desktop/R/DegromFangraphs.csv')
JacobDegromSeaonStats2019 <- JacobDegromTable[6, ]
write.csv(MikeTroutSeaonStats2019, file = "/Users/nolenconner/Desktop/R/JacobDegromSeaonStats2019two.csv")

