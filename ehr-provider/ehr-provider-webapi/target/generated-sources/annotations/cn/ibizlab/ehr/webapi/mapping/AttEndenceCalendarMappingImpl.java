package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.att.domain.AttEndenceCalendar;
import cn.ibizlab.ehr.webapi.dto.AttEndenceCalendarDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class AttEndenceCalendarMappingImpl implements AttEndenceCalendarMapping {

    @Override
    public AttEndenceCalendar toDomain(AttEndenceCalendarDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttEndenceCalendar attEndenceCalendar = new AttEndenceCalendar();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            attEndenceCalendar.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            attEndenceCalendar.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getAttendencecalendarname() != null ) {
            attEndenceCalendar.setAttendencecalendarname( dto.getAttendencecalendarname() );
        }
        if ( dto.getNd() != null ) {
            attEndenceCalendar.setNd( dto.getNd() );
        }
        if ( dto.getLx1() != null ) {
            attEndenceCalendar.setLx1( dto.getLx1() );
        }
        if ( dto.getRq() != null ) {
            attEndenceCalendar.setRq( dto.getRq() );
        }
        if ( dto.getOrmorgid() != null ) {
            attEndenceCalendar.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getVacholidayid() != null ) {
            attEndenceCalendar.setVacholidayid( dto.getVacholidayid() );
        }
        if ( dto.getAttendencecalendarid() != null ) {
            attEndenceCalendar.setAttendencecalendarid( dto.getAttendencecalendarid() );
        }
        if ( dto.getEnable() != null ) {
            attEndenceCalendar.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            attEndenceCalendar.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            attEndenceCalendar.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            attEndenceCalendar.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            attEndenceCalendar.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getZzdzs() != null ) {
            attEndenceCalendar.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getJjrlx() != null ) {
            attEndenceCalendar.setJjrlx( dto.getJjrlx() );
        }
        if ( dto.getVacholidayname() != null ) {
            attEndenceCalendar.setVacholidayname( dto.getVacholidayname() );
        }
        if ( dto.getOrmorgname() != null ) {
            attEndenceCalendar.setOrmorgname( dto.getOrmorgname() );
        }

        return attEndenceCalendar;
    }

    @Override
    public AttEndenceCalendarDTO toDto(AttEndenceCalendar entity) {
        if ( entity == null ) {
            return null;
        }

        AttEndenceCalendarDTO attEndenceCalendarDTO = new AttEndenceCalendarDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            attEndenceCalendarDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            attEndenceCalendarDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getAttendencecalendarname() != null ) {
            attEndenceCalendarDTO.setAttendencecalendarname( entity.getAttendencecalendarname() );
        }
        if ( entity.getNd() != null ) {
            attEndenceCalendarDTO.setNd( entity.getNd() );
        }
        if ( entity.getLx1() != null ) {
            attEndenceCalendarDTO.setLx1( entity.getLx1() );
        }
        if ( entity.getRq() != null ) {
            attEndenceCalendarDTO.setRq( entity.getRq() );
        }
        if ( entity.getOrmorgid() != null ) {
            attEndenceCalendarDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getVacholidayid() != null ) {
            attEndenceCalendarDTO.setVacholidayid( entity.getVacholidayid() );
        }
        if ( entity.getAttendencecalendarid() != null ) {
            attEndenceCalendarDTO.setAttendencecalendarid( entity.getAttendencecalendarid() );
        }
        if ( entity.getEnable() != null ) {
            attEndenceCalendarDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            attEndenceCalendarDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            attEndenceCalendarDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            attEndenceCalendarDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            attEndenceCalendarDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getZzdzs() != null ) {
            attEndenceCalendarDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getJjrlx() != null ) {
            attEndenceCalendarDTO.setJjrlx( entity.getJjrlx() );
        }
        if ( entity.getVacholidayname() != null ) {
            attEndenceCalendarDTO.setVacholidayname( entity.getVacholidayname() );
        }
        if ( entity.getOrmorgname() != null ) {
            attEndenceCalendarDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return attEndenceCalendarDTO;
    }

    @Override
    public List<AttEndenceCalendar> toDomain(List<AttEndenceCalendarDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttEndenceCalendar> list = new ArrayList<AttEndenceCalendar>( dtoList.size() );
        for ( AttEndenceCalendarDTO attEndenceCalendarDTO : dtoList ) {
            list.add( toDomain( attEndenceCalendarDTO ) );
        }

        return list;
    }

    @Override
    public List<AttEndenceCalendarDTO> toDto(List<AttEndenceCalendar> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttEndenceCalendarDTO> list = new ArrayList<AttEndenceCalendarDTO>( entityList.size() );
        for ( AttEndenceCalendar attEndenceCalendar : entityList ) {
            list.add( toDto( attEndenceCalendar ) );
        }

        return list;
    }
}
