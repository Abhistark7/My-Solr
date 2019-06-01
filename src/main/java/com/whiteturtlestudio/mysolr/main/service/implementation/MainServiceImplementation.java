package com.whiteturtlestudio.mysolr.main.service.implementation;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.whiteturtlestudio.mysolr.main.bos.Current;
import com.whiteturtlestudio.mysolr.main.bos.Energy;
import com.whiteturtlestudio.mysolr.main.bos.Humidity;
import com.whiteturtlestudio.mysolr.main.bos.Light;
import com.whiteturtlestudio.mysolr.main.bos.Temperature;
import com.whiteturtlestudio.mysolr.main.bos.User;
import com.whiteturtlestudio.mysolr.main.bos.Voltage;
import com.whiteturtlestudio.mysolr.main.bos.request.FromToTimestamp;
import com.whiteturtlestudio.mysolr.main.bos.request.Sensor;
import com.whiteturtlestudio.mysolr.main.bos.response.DateSaving;
import com.whiteturtlestudio.mysolr.main.constants.Constants;
import com.whiteturtlestudio.mysolr.main.mapper.CurrentCurrentEntityMapper;
import com.whiteturtlestudio.mysolr.main.mapper.EnergyEnergyEntitiyMapper;
import com.whiteturtlestudio.mysolr.main.mapper.HumidityHumidityEntityMapper;
import com.whiteturtlestudio.mysolr.main.mapper.LightLightEntitiyMapper;
import com.whiteturtlestudio.mysolr.main.mapper.SavingsSavingsEntityMapper;
import com.whiteturtlestudio.mysolr.main.mapper.TemperatureTemperatureEntityMapper;
import com.whiteturtlestudio.mysolr.main.mapper.UserUserEntityMapper;
import com.whiteturtlestudio.mysolr.main.mapper.VoltageVoltageEntityMapper;
import com.whiteturtlestudio.mysolr.main.models.CurrentEntity;
import com.whiteturtlestudio.mysolr.main.models.EnergyEntity;
import com.whiteturtlestudio.mysolr.main.models.HumidityEntity;
import com.whiteturtlestudio.mysolr.main.models.LightEntity;
import com.whiteturtlestudio.mysolr.main.models.SavingsEntity;
import com.whiteturtlestudio.mysolr.main.models.TemperatureEntity;
import com.whiteturtlestudio.mysolr.main.models.UserEntity;
import com.whiteturtlestudio.mysolr.main.models.VoltageEntity;
import com.whiteturtlestudio.mysolr.main.repository.CurrentRepository;
import com.whiteturtlestudio.mysolr.main.repository.EnergyRepository;
import com.whiteturtlestudio.mysolr.main.repository.HumidityRepository;
import com.whiteturtlestudio.mysolr.main.repository.LightRepository;
import com.whiteturtlestudio.mysolr.main.repository.SavingsRepository;
import com.whiteturtlestudio.mysolr.main.repository.TemperatureRepository;
import com.whiteturtlestudio.mysolr.main.repository.UserRepository;
import com.whiteturtlestudio.mysolr.main.repository.VoltageRepository;
import com.whiteturtlestudio.mysolr.main.service.MainService;
import com.whiteturtlestudio.mysolr.main.util.TimeUtils;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class MainServiceImplementation implements MainService {

  @Autowired
  private CurrentRepository currentRepository;

  @Autowired
  private VoltageRepository voltageRepository;

  @Autowired
  private LightRepository lightRepository;

  @Autowired
  private HumidityRepository humidityRepository;

  @Autowired
  private TemperatureRepository temperatureRepository;

  @Autowired
  private EnergyRepository energyRepository;

  @Autowired
  private SavingsRepository savingsRepository;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private CurrentCurrentEntityMapper currentCurrentEntityMapper;

  @Autowired
  private VoltageVoltageEntityMapper voltageVoltageEntityMapper;

  @Autowired
  private LightLightEntitiyMapper lightLightEntitiyMapper;

  @Autowired
  private HumidityHumidityEntityMapper humidityHumidityEntityMapper;

  @Autowired
  private TemperatureTemperatureEntityMapper temperatureTemperatureEntityMapper;

  @Autowired
  private SavingsSavingsEntityMapper savingsSavingsEntityMapper;

  @Autowired
  private EnergyEnergyEntitiyMapper energyEnergyEntitiyMapper;

  @Autowired
  private UserUserEntityMapper userUserEntityMapper;

  @Override
  public List<Current> getAllCurrent(FromToTimestamp fromToTimestamp) {
    Long fromTimestamp = TimeUtils.getUnixTimestampFromDateTime(fromToTimestamp.getFromTimestamp());
    Long toTimestamp = TimeUtils.getUnixTimestampFromDateTime(fromToTimestamp.getToTimestamp());
    List<CurrentEntity> filteredCurrentEntities = currentRepository.findAll().stream().filter(
            current -> Long.parseLong(current.getTimestamp()) > fromTimestamp
                    && Long.parseLong(current.getTimestamp()) < toTimestamp)
            .collect(Collectors.toList());
    List<Current> currentList =
            currentCurrentEntityMapper.currentEntityListToCurrentList(filteredCurrentEntities);
    currentList.forEach(i -> i.setTimestamp(TimeUtils.getDateTimeFromUnixTimestamp(i.getTimestamp())));
    return currentList;
  }

  @Override
  public List<Voltage> getAllVoltage(FromToTimestamp fromToTimestamp) {
    Long fromTimestamp = TimeUtils.getUnixTimestampFromDateTime(fromToTimestamp.getFromTimestamp());
    Long toTimestamp = TimeUtils.getUnixTimestampFromDateTime(fromToTimestamp.getToTimestamp());
    List<VoltageEntity> filteredVoltageEntities = voltageRepository.findAll().stream().filter(
            voltage -> Long.parseLong(voltage.getTimestamp()) > fromTimestamp
                    && Long.parseLong(voltage.getTimestamp()) < toTimestamp)
            .collect(Collectors.toList());
    List<Voltage> voltageList =
            voltageVoltageEntityMapper.volageEntityListToVoltageList(filteredVoltageEntities);
    voltageList.forEach(i -> i.setTimestamp(TimeUtils.getDateTimeFromUnixTimestamp(i.getTimestamp())));
    return voltageList;
  }

  @Override
  public List<Light> getAllLight(FromToTimestamp fromToTimestamp) {
    Long fromTimestamp = TimeUtils.getUnixTimestampFromDateTime(fromToTimestamp.getFromTimestamp());
    Long toTimestamp = TimeUtils.getUnixTimestampFromDateTime(fromToTimestamp.getToTimestamp());
    List<LightEntity> filteredLightEntities = lightRepository.findAll().stream().filter(
            light -> Long.parseLong(light.getTimestamp()) > fromTimestamp
                    && Long.parseLong(light.getTimestamp()) < toTimestamp)
            .collect(Collectors.toList());
    List<Light> lightList =
            lightLightEntitiyMapper.lightEntityListToLightList(filteredLightEntities);
    lightList.forEach(i -> i.setTimestamp(TimeUtils.getDateTimeFromUnixTimestamp(i.getTimestamp())));
    return lightList;
  }

  @Override
  public List<Humidity> getAllHumidity(FromToTimestamp fromToTimestamp) {
    Long fromTimestamp = TimeUtils.getUnixTimestampFromDateTime(fromToTimestamp.getFromTimestamp());
    Long toTimestamp = TimeUtils.getUnixTimestampFromDateTime(fromToTimestamp.getToTimestamp());
    List<HumidityEntity> filteredHumidityEntities = humidityRepository.findAll().stream().filter(
            humidity -> Long.parseLong(humidity.getTimestamp()) > fromTimestamp
                    && Long.parseLong(humidity.getTimestamp()) < toTimestamp)
            .collect(Collectors.toList());
    List<Humidity> humidityList = humidityHumidityEntityMapper
            .humidityEntityListToHumidityList(filteredHumidityEntities);
    humidityList.forEach(i -> i.setTimestamp(TimeUtils.getDateTimeFromUnixTimestamp(i.getTimestamp())));
    return humidityList;
  }

  @Override
  public List<Temperature> getAllTemperature(FromToTimestamp fromToTimestamp) {
    Long fromTimestamp = TimeUtils.getUnixTimestampFromDateTime(fromToTimestamp.getFromTimestamp());
    Long toTimestamp = TimeUtils.getUnixTimestampFromDateTime(fromToTimestamp.getToTimestamp());
    List<TemperatureEntity> filteredTemperatureEntities =
            temperatureRepository.findAll().stream().filter(
                    temperature -> Long.parseLong(temperature.getTimestamp()) > fromTimestamp
                            && Long.parseLong(temperature.getTimestamp()) < toTimestamp)
                    .collect(Collectors.toList());
    List<Temperature> temperatureList = temperatureTemperatureEntityMapper
            .temperatureEntityListToTemperatureList(filteredTemperatureEntities);
    temperatureList.forEach(i -> i.setTimestamp(TimeUtils.getDateTimeFromUnixTimestamp(i.getTimestamp())));
    return temperatureList;
  }

  @Override
  public boolean saveSensorData(Sensor sensor) {
    currentRepository.save(currentCurrentEntityMapper.currentToCurrentEntity(sensor.getCurrent()));
    voltageRepository.save(voltageVoltageEntityMapper.voltageToVoltageEntity(sensor.getVoltage()));
    lightRepository.save(lightLightEntitiyMapper.lightToLightEntityMapper(sensor.getLight()));
    humidityRepository.save(humidityHumidityEntityMapper.humidityToHumidityEntityMapper(sensor.getHumidity()));
    temperatureRepository.save(temperatureTemperatureEntityMapper.temperatureToTemperatureEntityMapper(sensor.getTemperature()));
    saveEnergy(sensor.getCurrent(), sensor.getVoltage());
    return true;
  }

  @Override
  public DateSaving getTodaySavings() {
    return DateSaving.builder().date(TimeUtils.getTodayDateString())
            .savings(calculateSavings(getTodayEnergyGeneration().getSavings()))
            .build();
  }

  @Override
  public DateSaving getYesterdaySavings() {
    Long yesterdayStartTimestamp = TimeUtils.getDateStartTimestamp(TimeUtils.getYesterdayDateString());
    Long todayStartTimestamp = TimeUtils.getDateStartTimestamp(TimeUtils.getTodayDateString());
    List<EnergyEntity> filteredEnergy = energyRepository.findAll().stream().filter(
            savingsEntity -> Long.parseLong(savingsEntity.getTimestamp()) < todayStartTimestamp
                    && Long.parseLong(savingsEntity.getTimestamp()) > yesterdayStartTimestamp)
            .collect(Collectors.toList());
    return DateSaving.builder().date(TimeUtils.getYesterdayDateString())
            .savings(calculateSavings(calculateTotalEnergy(energyEnergyEntitiyMapper
                    .energyEntityListToEnergyList(filteredEnergy))))
            .build();
  }

  @Override
  public DateSaving getTodayEnergyGeneration() {
    Long currentTimestamp = System.currentTimeMillis();
    Long todayStartTimestamp = TimeUtils.getDateStartTimestamp(TimeUtils.getTodayDateString());
    List<EnergyEntity> filteredEnergy = energyRepository.findAll().stream().filter(
            savingsEntity -> Long.parseLong(savingsEntity.getTimestamp()) > todayStartTimestamp
                    && Long.parseLong(savingsEntity.getTimestamp()) < currentTimestamp)
            .collect(Collectors.toList());
    return DateSaving.builder().date(TimeUtils.getTodayDateString())
            .savings(calculateTotalEnergy(energyEnergyEntitiyMapper.energyEntityListToEnergyList(filteredEnergy)))
            .build();
  }

  @Override
  public DateSaving getTotalSavings() {
    String registeredDate = userRepository.findUserByUserId("123").getRegisteredDate();
    double totalDays = TimeUtils.getNoOfDaysBetweenDates(registeredDate, TimeUtils.getTodayDateString());
    return DateSaving.builder()
            .date(String.valueOf(totalDays))
            .savings(calculateTotalSavings())
            .build();
  }

  private String calculateTotalSavings() {
    List<SavingsEntity> savingsEntityList = savingsRepository.findSavingsByUserId(123);
    double totalSavings = 0;
    for(SavingsEntity savingsEntity : savingsEntityList) {
      totalSavings += Double.parseDouble(savingsEntity.getValue());
    }
    return String.valueOf(totalSavings);
  }

  @Override
  public boolean saveUser(User user) {
    UserEntity userEntity = userUserEntityMapper.userToUserEntity(user);
    userEntity.setUserId(generateUid());
    userRepository.save(userEntity);
    return true;
  }

  @Override
  public User getUser() {
    //todo extract user id from token and use it for retrieving user
    return userUserEntityMapper.userEntityToUser(userRepository.findUserByUserId("123"));
  }

  private void saveEnergy(Current current, Voltage voltage) {
    EnergyEntity energyEntity = EnergyEntity.builder()
            .timestamp(current.getTimestamp())
            .userId(current.getUserId())
            .value(calculateEnergy(current.getValue(), voltage.getValue()).toString())
            .build();
    energyRepository.save(energyEntity);
  }

  private Double calculateEnergy(String current, String voltage) {
    return Double.valueOf(current) * Double.valueOf(voltage);
  }

  private String calculateSavings(String totalEnergy) {
    double energy = Double.parseDouble(totalEnergy);
    double totalSavings = Constants.ZERO;
    //todo extract user id from token and use it for retrieving user
    if (userRepository.findUserByUserId("123") != null) {
      totalSavings =
              energy * Double.parseDouble(userRepository.findUserByUserId("123").getTariff());
    }
    return String.valueOf(totalSavings);
  }

  private String calculateTotalEnergy(List<Energy> energyList) {
    energyList.sort(Comparator.comparing(Energy::getTimestamp));
    double totalEnergy = Constants.ZERO;
    for (int i = Constants.ZERO; i < energyList.size() - Constants.ONE; i++) {
      double value2 = Double.parseDouble(energyList.get(i + Constants.ONE).getValue());
      double timeDiff =
              Double.parseDouble(energyList.get(i + Constants.ONE).getTimestamp()) - Double.parseDouble(energyList.get(i).getTimestamp());
      double energyForTimeDiff = (value2 * timeDiff) / Constants.TOTAL_SECONDS_IN_A_DAY;
      totalEnergy += energyForTimeDiff;
    }
    return String.valueOf(totalEnergy);
  }

  private String generateUid() {
    String uniqueID = UUID.randomUUID().toString();
    if (checkIfUidExistsInDb(uniqueID)) {
      generateUid();
    }
    return uniqueID;
  }

  private boolean checkIfUidExistsInDb(String uid) {
    return userRepository.findUserByUserId(uid) != null;
  }

}