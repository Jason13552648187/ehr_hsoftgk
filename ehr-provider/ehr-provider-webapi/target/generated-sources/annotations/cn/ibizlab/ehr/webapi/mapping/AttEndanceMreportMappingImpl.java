package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.att.domain.AttEndanceMreport;
import cn.ibizlab.ehr.webapi.dto.AttEndanceMreportDTO;
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
    date = "2021-09-04T00:31:48+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class AttEndanceMreportMappingImpl implements AttEndanceMreportMapping {

    @Override
    public AttEndanceMreport toDomain(AttEndanceMreportDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttEndanceMreport attEndanceMreport = new AttEndanceMreport();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            attEndanceMreport.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            attEndanceMreport.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getAttendancemreportname() != null ) {
            attEndanceMreport.setAttendancemreportname( dto.getAttendancemreportname() );
        }
        if ( dto.getYf() != null ) {
            attEndanceMreport.setYf( dto.getYf() );
        }
        if ( dto.getNd() != null ) {
            attEndanceMreport.setNd( dto.getNd() );
        }
        if ( dto.getZt() != null ) {
            attEndanceMreport.setZt( dto.getZt() );
        }
        if ( dto.getOrmorgid() != null ) {
            attEndanceMreport.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getAttendencesetupid() != null ) {
            attEndanceMreport.setAttendencesetupid( dto.getAttendencesetupid() );
        }
        if ( dto.getUpdatedate() != null ) {
            attEndanceMreport.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getAttendancemreportid() != null ) {
            attEndanceMreport.setAttendancemreportid( dto.getAttendancemreportid() );
        }
        if ( dto.getCreateman() != null ) {
            attEndanceMreport.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgid() != null ) {
            attEndanceMreport.setOrgid( dto.getOrgid() );
        }
        if ( dto.getCreatedate() != null ) {
            attEndanceMreport.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            attEndanceMreport.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getEnable() != null ) {
            attEndanceMreport.setEnable( dto.getEnable() );
        }
        if ( dto.getOrmorgname() != null ) {
            attEndanceMreport.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getPimpersonname() != null ) {
            attEndanceMreport.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getPimpersonid() != null ) {
            attEndanceMreport.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getAttendencesetupname() != null ) {
            attEndanceMreport.setAttendencesetupname( dto.getAttendencesetupname() );
        }

        return attEndanceMreport;
    }

    @Override
    public AttEndanceMreportDTO toDto(AttEndanceMreport entity) {
        if ( entity == null ) {
            return null;
        }

        AttEndanceMreportDTO attEndanceMreportDTO = new AttEndanceMreportDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            attEndanceMreportDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            attEndanceMreportDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getAttendancemreportname() != null ) {
            attEndanceMreportDTO.setAttendancemreportname( entity.getAttendancemreportname() );
        }
        if ( entity.getYf() != null ) {
            attEndanceMreportDTO.setYf( entity.getYf() );
        }
        if ( entity.getNd() != null ) {
            attEndanceMreportDTO.setNd( entity.getNd() );
        }
        if ( entity.getZt() != null ) {
            attEndanceMreportDTO.setZt( entity.getZt() );
        }
        if ( entity.getOrmorgid() != null ) {
            attEndanceMreportDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getAttendencesetupid() != null ) {
            attEndanceMreportDTO.setAttendencesetupid( entity.getAttendencesetupid() );
        }
        if ( entity.getUpdatedate() != null ) {
            attEndanceMreportDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getAttendancemreportid() != null ) {
            attEndanceMreportDTO.setAttendancemreportid( entity.getAttendancemreportid() );
        }
        if ( entity.getCreateman() != null ) {
            attEndanceMreportDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgid() != null ) {
            attEndanceMreportDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getCreatedate() != null ) {
            attEndanceMreportDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            attEndanceMreportDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getEnable() != null ) {
            attEndanceMreportDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getOrmorgname() != null ) {
            attEndanceMreportDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getPimpersonname() != null ) {
            attEndanceMreportDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getPimpersonid() != null ) {
            attEndanceMreportDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getAttendencesetupname() != null ) {
            attEndanceMreportDTO.setAttendencesetupname( entity.getAttendencesetupname() );
        }

        return attEndanceMreportDTO;
    }

    @Override
    public List<AttEndanceMreport> toDomain(List<AttEndanceMreportDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttEndanceMreport> list = new ArrayList<AttEndanceMreport>( dtoList.size() );
        for ( AttEndanceMreportDTO attEndanceMreportDTO : dtoList ) {
            list.add( toDomain( attEndanceMreportDTO ) );
        }

        return list;
    }

    @Override
    public List<AttEndanceMreportDTO> toDto(List<AttEndanceMreport> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttEndanceMreportDTO> list = new ArrayList<AttEndanceMreportDTO>( entityList.size() );
        for ( AttEndanceMreport attEndanceMreport : entityList ) {
            list.add( toDto( attEndanceMreport ) );
        }

        return list;
    }
}
