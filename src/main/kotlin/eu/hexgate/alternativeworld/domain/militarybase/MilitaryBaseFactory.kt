package eu.hexgate.alternativeworld.domain.militarybase

class MilitaryBaseFactory(private val buildingsCreator: BuildingsCreator) {

    fun create(userId: Long) =
            MilitaryBase(
                    playerId = userId,
                    rawMaterials = RawMaterials.init(),
                    energyBalance = EnergyBalance.init(),
                    coordinates = Coordinates.initWithRandomValues(),
                    buildings = buildingsCreator.create()
            )

}