package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.att.domain.AttEndanceSettings;
import cn.ibizlab.ehr.webapi.dto.AttEndanceSettingsDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class AttEndanceSettingsMappingImpl implements AttEndanceSettingsMapping {

    @Override
    public AttEndanceSettings toDomain(AttEndanceSettingsDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttEndanceSettings attEndanceSettings = new AttEndanceSettings();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            attEndanceSettings.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            attEndanceSettings.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getAttendancesettingsname() != null ) {
            attEndanceSettings.setAttendancesettingsname( dto.getAttendancesettingsname() );
        }
        if ( dto.getDkfs() != null ) {
            attEndanceSettings.setDkfs( dto.getDkfs() );
        }
        if ( dto.getYgbh() != null ) {
            attEndanceSettings.setYgbh( dto.getYgbh() );
        }
        if ( dto.getPimpersonname() != null ) {
            attEndanceSettings.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getAttendencesetupid() != null ) {
            attEndanceSettings.setAttendencesetupid( dto.getAttendencesetupid() );
        }
        if ( dto.getPimpersonid() != null ) {
            attEndanceSettings.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getUpdatedate() != null ) {
            attEndanceSettings.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            attEndanceSettings.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            attEndanceSettings.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getAttendancesettingsid() != null ) {
            attEndanceSettings.setAttendancesettingsid( dto.getAttendancesettingsid() );
        }
        if ( dto.getCreateman() != null ) {
            attEndanceSettings.setCreateman( dto.getCreateman() );
        }
        if ( dto.getAttendencesetupname() != null ) {
            attEndanceSettings.setAttendencesetupname( dto.getAttendencesetupname() );
        }
        if ( dto.getOrmorgname2() != null ) {
            attEndanceSettings.setOrmorgname2( dto.getOrmorgname2() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            attEndanceSettings.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getYgzt() != null ) {
            attEndanceSettings.setYgzt( dto.getYgzt() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            attEndanceSettings.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmorgid2() != null ) {
            attEndanceSettings.setOrmorgid2( dto.getOrmorgid2() );
        }
        if ( dto.getOrmorgid() != null ) {
            attEndanceSettings.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getZzdzs() != null ) {
            attEndanceSettings.setZzdzs( dto.getZzdzs() );
        }

        return attEndanceSettings;
    }

    @Override
    public AttEndanceSettingsDTO toDto(AttEndanceSettings entity) {
        if ( entity == null ) {
            return null;
        }

        AttEndanceSettingsDTO attEndanceSettingsDTO = new AttEndanceSettingsDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            attEndanceSettingsDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            attEndanceSettingsDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getAttendancesettingsname() != null ) {
            attEndanceSettingsDTO.setAttendancesettingsname( entity.getAttendancesettingsname() );
        }
        if ( entity.getDkfs() != null ) {
            attEndanceSettingsDTO.setDkfs( entity.getDkfs() );
        }
        if ( entity.getYgbh() != null ) {
            attEndanceSettingsDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getPimpersonname() != null ) {
            attEndanceSettingsDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getAttendencesetupid() != null ) {
            attEndanceSettingsDTO.setAttendencesetupid( entity.getAttendencesetupid() );
        }
        if ( entity.getPimpersonid() != null ) {
            attEndanceSettingsDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getUpdatedate() != null ) {
            attEndanceSettingsDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            attEndanceSettingsDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            attEndanceSettingsDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getAttendancesettingsid() != null ) {
            attEndanceSettingsDTO.setAttendancesettingsid( entity.getAttendancesettingsid() );
        }
        if ( entity.getCreateman() != null ) {
            attEndanceSettingsDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getAttendencesetupname() != null ) {
            attEndanceSettingsDTO.setAttendencesetupname( entity.getAttendencesetupname() );
        }
        if ( entity.getOrmorgname2() != null ) {
            attEndanceSettingsDTO.setOrmorgname2( entity.getOrmorgname2() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            attEndanceSettingsDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getYgzt() != null ) {
            attEndanceSettingsDTO.setYgzt( entity.getYgzt() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            attEndanceSettingsDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmorgid2() != null ) {
            attEndanceSettingsDTO.setOrmorgid2( entity.getOrmorgid2() );
        }
        if ( entity.getOrmorgid() != null ) {
            attEndanceSettingsDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getZzdzs() != null ) {
            attEndanceSettingsDTO.setZzdzs( entity.getZzdzs() );
        }

        return attEndanceSettingsDTO;
    }

    @Override
    public List<AttEndanceSettings> toDomain(List<AttEndanceSettingsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttEndanceSettings> list = new ArrayList<AttEndanceSettings>( dtoList.size() );
        for ( AttEndanceSettingsDTO attEndanceSettingsDTO : dtoList ) {
            list.add( toDomain( attEndanceSettingsDTO ) );
        }

        return list;
    }

    @Override
    public List<AttEndanceSettingsDTO> toDto(List<AttEndanceSettings> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttEndanceSettingsDTO> list = new ArrayList<AttEndanceSettingsDTO>( entityList.size() );
        for ( AttEndanceSettings attEndanceSettings : entityList ) {
            list.add( toDto( attEndanceSettings ) );
        }

        return list;
    }
}
