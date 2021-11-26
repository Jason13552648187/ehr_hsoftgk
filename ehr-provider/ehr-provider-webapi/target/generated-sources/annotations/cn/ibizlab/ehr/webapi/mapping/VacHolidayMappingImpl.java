package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacHoliday;
import cn.ibizlab.ehr.webapi.dto.VacHolidayDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class VacHolidayMappingImpl implements VacHolidayMapping {

    @Override
    public VacHoliday toDomain(VacHolidayDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacHoliday vacHoliday = new VacHoliday();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacHoliday.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacHoliday.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getNd() != null ) {
            vacHoliday.setNd( dto.getNd() );
        }
        if ( dto.getEnable() != null ) {
            vacHoliday.setEnable( dto.getEnable() );
        }
        if ( dto.getVacholidayname() != null ) {
            vacHoliday.setVacholidayname( dto.getVacholidayname() );
        }
        if ( dto.getAge() != null ) {
            vacHoliday.setAge( dto.getAge() );
        }
        if ( dto.getJssj() != null ) {
            vacHoliday.setJssj( dto.getJssj() );
        }
        if ( dto.getBz() != null ) {
            vacHoliday.setBz( dto.getBz() );
        }
        if ( dto.getJjrlx() != null ) {
            vacHoliday.setJjrlx( dto.getJjrlx() );
        }
        if ( dto.getKssj() != null ) {
            vacHoliday.setKssj( dto.getKssj() );
        }
        if ( dto.getSex() != null ) {
            vacHoliday.setSex( dto.getSex() );
        }
        if ( dto.getVacholidayrulesid() != null ) {
            vacHoliday.setVacholidayrulesid( dto.getVacholidayrulesid() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacHoliday.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            vacHoliday.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getVacholidayid() != null ) {
            vacHoliday.setVacholidayid( dto.getVacholidayid() );
        }
        if ( dto.getCreateman() != null ) {
            vacHoliday.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            vacHoliday.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrmorgname() != null ) {
            vacHoliday.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getVacholidayrulesname() != null ) {
            vacHoliday.setVacholidayrulesname( dto.getVacholidayrulesname() );
        }
        if ( dto.getOrmorgid() != null ) {
            vacHoliday.setOrmorgid( dto.getOrmorgid() );
        }

        return vacHoliday;
    }

    @Override
    public VacHolidayDTO toDto(VacHoliday entity) {
        if ( entity == null ) {
            return null;
        }

        VacHolidayDTO vacHolidayDTO = new VacHolidayDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacHolidayDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacHolidayDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getNd() != null ) {
            vacHolidayDTO.setNd( entity.getNd() );
        }
        if ( entity.getEnable() != null ) {
            vacHolidayDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getVacholidayname() != null ) {
            vacHolidayDTO.setVacholidayname( entity.getVacholidayname() );
        }
        if ( entity.getAge() != null ) {
            vacHolidayDTO.setAge( entity.getAge() );
        }
        if ( entity.getJssj() != null ) {
            vacHolidayDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getBz() != null ) {
            vacHolidayDTO.setBz( entity.getBz() );
        }
        if ( entity.getJjrlx() != null ) {
            vacHolidayDTO.setJjrlx( entity.getJjrlx() );
        }
        if ( entity.getKssj() != null ) {
            vacHolidayDTO.setKssj( entity.getKssj() );
        }
        if ( entity.getSex() != null ) {
            vacHolidayDTO.setSex( entity.getSex() );
        }
        if ( entity.getVacholidayrulesid() != null ) {
            vacHolidayDTO.setVacholidayrulesid( entity.getVacholidayrulesid() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacHolidayDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            vacHolidayDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getVacholidayid() != null ) {
            vacHolidayDTO.setVacholidayid( entity.getVacholidayid() );
        }
        if ( entity.getCreateman() != null ) {
            vacHolidayDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            vacHolidayDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrmorgname() != null ) {
            vacHolidayDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getVacholidayrulesname() != null ) {
            vacHolidayDTO.setVacholidayrulesname( entity.getVacholidayrulesname() );
        }
        if ( entity.getOrmorgid() != null ) {
            vacHolidayDTO.setOrmorgid( entity.getOrmorgid() );
        }

        return vacHolidayDTO;
    }

    @Override
    public List<VacHoliday> toDomain(List<VacHolidayDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacHoliday> list = new ArrayList<VacHoliday>( dtoList.size() );
        for ( VacHolidayDTO vacHolidayDTO : dtoList ) {
            list.add( toDomain( vacHolidayDTO ) );
        }

        return list;
    }

    @Override
    public List<VacHolidayDTO> toDto(List<VacHoliday> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacHolidayDTO> list = new ArrayList<VacHolidayDTO>( entityList.size() );
        for ( VacHoliday vacHoliday : entityList ) {
            list.add( toDto( vacHoliday ) );
        }

        return list;
    }
}
