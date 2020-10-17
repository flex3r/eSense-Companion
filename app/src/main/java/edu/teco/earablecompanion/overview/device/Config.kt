package edu.teco.earablecompanion.overview.device

import edu.teco.earablecompanion.data.entities.SensorDataEntry
import java.util.*

abstract class Config {

    // Characteristic to change sensor configuration
    abstract val sensorConfigCharacteristic: String

    // Characteristic to enable sensor
    abstract val configCharacteristic: String

    // Characteristics for receiving data
    abstract val sensorCharacteristics: List<String>

    abstract val notificationDescriptor: UUID

    abstract val sensorConfigCharacteristicData: ByteArray
    abstract val enableSensorCharacteristicData: ByteArray
    abstract val disableSensorCharacteristicData: ByteArray

    abstract fun updateValues(bytes: ByteArray)
    abstract fun parseSensorValues(bytes: ByteArray, uuid: String): SensorDataEntry?
}