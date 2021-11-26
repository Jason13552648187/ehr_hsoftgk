package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.att.domain.AttEndenceSetup;
import cn.ibizlab.ehr.webapi.dto.AttEndenceSetupDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class AttEndenceSetupMappingImpl implements AttEndenceSetupMapping {

    @Override
    public AttEndenceSetup toDomain(AttEndenceSetupDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttEndenceSetup attEndenceSetup = new AttEndenceSetup();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            attEndenceSetup.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            attEndenceSetup.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXbsj() != null ) {
            attEndenceSetup.setXbsj( dto.getXbsj() );
        }
        if ( dto.getAttendencesetupname() != null ) {
            attEndenceSetup.setAttendencesetupname( dto.getAttendencesetupname() );
        }
        if ( dto.getAllowoutwork() != null ) {
            attEndenceSetup.setAllowoutwork( dto.getAllowoutwork() );
        }
        if ( dto.getDkfs() != null ) {
            attEndenceSetup.setDkfs( dto.getDkfs() );
        }
        if ( dto.getSbsj() != null ) {
            attEndenceSetup.setSbsj( dto.getSbsj() );
        }
        if ( dto.getOrmorgid() != null ) {
            attEndenceSetup.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimpersonid() != null ) {
            attEndenceSetup.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getVacholidayrulesid() != null ) {
            attEndenceSetup.setVacholidayrulesid( dto.getVacholidayrulesid() );
        }
        if ( dto.getCreateman() != null ) {
            attEndenceSetup.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgid() != null ) {
            attEndenceSetup.setOrgid( dto.getOrgid() );
        }
        if ( dto.getUpdateman() != null ) {
            attEndenceSetup.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            attEndenceSetup.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            attEndenceSetup.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getEnable() != null ) {
            attEndenceSetup.setEnable( dto.getEnable() );
        }
        if ( dto.getAttendencesetupid() != null ) {
            attEndenceSetup.setAttendencesetupid( dto.getAttendencesetupid() );
        }
        if ( dto.getPimpersonname() != null ) {
            attEndenceSetup.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getVacholidayrulesname() != null ) {
            attEndenceSetup.setVacholidayrulesname( dto.getVacholidayrulesname() );
        }
        if ( dto.getPorgid() != null ) {
            attEndenceSetup.setPorgid( dto.getPorgid() );
        }
        if ( dto.getOrmorgname() != null ) {
            attEndenceSetup.setOrmorgname( dto.getOrmorgname() );
        }

        return attEndenceSetup;
    }

    @Override
    public AttEndenceSetupDTO toDto(AttEndenceSetup entity) {
        if ( entity == null ) {
            return null;
        }

        AttEndenceSetupDTO attEndenceSetupDTO = new AttEndenceSetupDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            attEndenceSetupDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            attEndenceSetupDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXbsj() != null ) {
            attEndenceSetupDTO.setXbsj( entity.getXbsj() );
        }
        if ( entity.getAttendencesetupname() != null ) {
            attEndenceSetupDTO.setAttendencesetupname( entity.getAttendencesetupname() );
        }
        if ( entity.getAllowoutwork() != null ) {
            attEndenceSetupDTO.setAllowoutwork( entity.getAllowoutwork() );
        }
        if ( entity.getDkfs() != null ) {
            attEndenceSetupDTO.setDkfs( entity.getDkfs() );
        }
        if ( entity.getSbsj() != null ) {
            attEndenceSetupDTO.setSbsj( entity.getSbsj() );
        }
        if ( entity.getOrmorgid() != null ) {
            attEndenceSetupDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimpersonid() != null ) {
            attEndenceSetupDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getVacholidayrulesid() != null ) {
            attEndenceSetupDTO.setVacholidayrulesid( entity.getVacholidayrulesid() );
        }
        if ( entity.getCreateman() != null ) {
            attEndenceSetupDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgid() != null ) {
            attEndenceSetupDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getUpdateman() != null ) {
            attEndenceSetupDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            attEndenceSetupDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            attEndenceSetupDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getEnable() != null ) {
            attEndenceSetupDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getAttendencesetupid() != null ) {
            attEndenceSetupDTO.setAttendencesetupid( entity.getAttendencesetupid() );
        }
        if ( entity.getPimpersonname() != null ) {
            attEndenceSetupDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getVacholidayrulesname() != null ) {
            attEndenceSetupDTO.setVacholidayrulesname( entity.getVacholidayrulesname() );
        }
        if ( entity.getPorgid() != null ) {
            attEndenceSetupDTO.setPorgid( entity.getPorgid() );
        }
        if ( entity.getOrmorgname() != null ) {
            attEndenceSetupDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return attEndenceSetupDTO;
    }

    @Override
    public List<AttEndenceSetup> toDomain(List<AttEndenceSetupDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttEndenceSetup> list = new ArrayList<AttEndenceSetup>( dtoList.size() );
        for ( AttEndenceSetupDTO attEndenceSetupDTO : dtoList ) {
            list.add( toDomain( attEndenceSetupDTO ) );
        }

        return list;
    }

    @Override
    public List<AttEndenceSetupDTO> toDto(List<AttEndenceSetup> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttEndenceSetupDTO> list = new ArrayList<AttEndenceSetupDTO>( entityList.size() );
        for ( AttEndenceSetup attEndenceSetup : entityList ) {
            list.add( toDto( attEndenceSetup ) );
        }

        return list;
    }
}
