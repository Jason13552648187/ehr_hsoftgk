package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.att.domain.AttEndanceRecord;
import cn.ibizlab.ehr.webapi.dto.AttEndanceRecordDTO;
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
    date = "2021-09-04T00:31:46+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class AttEndanceRecordMappingImpl implements AttEndanceRecordMapping {

    @Override
    public AttEndanceRecord toDomain(AttEndanceRecordDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttEndanceRecord attEndanceRecord = new AttEndanceRecord();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            attEndanceRecord.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            attEndanceRecord.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getAttenddate() != null ) {
            attEndanceRecord.setAttenddate( dto.getAttenddate() );
        }
        if ( dto.getDksjqt() != null ) {
            attEndanceRecord.setDksjqt( dto.getDksjqt() );
        }
        if ( dto.getIsoutoffice() != null ) {
            attEndanceRecord.setIsoutoffice( dto.getIsoutoffice() );
        }
        if ( dto.getDkfs() != null ) {
            attEndanceRecord.setDkfs( dto.getDkfs() );
        }
        if ( dto.getIsoutleave() != null ) {
            attEndanceRecord.setIsoutleave( dto.getIsoutleave() );
        }
        if ( dto.getDksjqd() != null ) {
            attEndanceRecord.setDksjqd( dto.getDksjqd() );
        }
        if ( dto.getAttendancerecordname() != null ) {
            attEndanceRecord.setAttendancerecordname( dto.getAttendancerecordname() );
        }
        if ( dto.getPimpersonid() != null ) {
            attEndanceRecord.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmbmkqdzid() != null ) {
            attEndanceRecord.setOrmbmkqdzid( dto.getOrmbmkqdzid() );
        }
        if ( dto.getAttendancemreportid() != null ) {
            attEndanceRecord.setAttendancemreportid( dto.getAttendancemreportid() );
        }
        if ( dto.getTrmtrainplantermid() != null ) {
            attEndanceRecord.setTrmtrainplantermid( dto.getTrmtrainplantermid() );
        }
        if ( dto.getCreatedate() != null ) {
            attEndanceRecord.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrgid() != null ) {
            attEndanceRecord.setOrgid( dto.getOrgid() );
        }
        if ( dto.getEnable() != null ) {
            attEndanceRecord.setEnable( dto.getEnable() );
        }
        if ( dto.getCreateman() != null ) {
            attEndanceRecord.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            attEndanceRecord.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getAttendancerecordid() != null ) {
            attEndanceRecord.setAttendancerecordid( dto.getAttendancerecordid() );
        }
        if ( dto.getUpdateman() != null ) {
            attEndanceRecord.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getOrgsectorid() != null ) {
            attEndanceRecord.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getPimpersonname() != null ) {
            attEndanceRecord.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            attEndanceRecord.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getYgbh() != null ) {
            attEndanceRecord.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            attEndanceRecord.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getTrmtrainplantermname() != null ) {
            attEndanceRecord.setTrmtrainplantermname( dto.getTrmtrainplantermname() );
        }
        if ( dto.getOrmbmkqdzname() != null ) {
            attEndanceRecord.setOrmbmkqdzname( dto.getOrmbmkqdzname() );
        }
        if ( dto.getZzdzs() != null ) {
            attEndanceRecord.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getZjhm() != null ) {
            attEndanceRecord.setZjhm( dto.getZjhm() );
        }
        if ( dto.getOrmorgid() != null ) {
            attEndanceRecord.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getAttendancemreportmxname() != null ) {
            attEndanceRecord.setAttendancemreportmxname( dto.getAttendancemreportmxname() );
        }
        if ( dto.getOrmorgname() != null ) {
            attEndanceRecord.setOrmorgname( dto.getOrmorgname() );
        }

        return attEndanceRecord;
    }

    @Override
    public AttEndanceRecordDTO toDto(AttEndanceRecord entity) {
        if ( entity == null ) {
            return null;
        }

        AttEndanceRecordDTO attEndanceRecordDTO = new AttEndanceRecordDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            attEndanceRecordDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            attEndanceRecordDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getAttenddate() != null ) {
            attEndanceRecordDTO.setAttenddate( entity.getAttenddate() );
        }
        if ( entity.getDksjqt() != null ) {
            attEndanceRecordDTO.setDksjqt( entity.getDksjqt() );
        }
        if ( entity.getIsoutoffice() != null ) {
            attEndanceRecordDTO.setIsoutoffice( entity.getIsoutoffice() );
        }
        if ( entity.getDkfs() != null ) {
            attEndanceRecordDTO.setDkfs( entity.getDkfs() );
        }
        if ( entity.getIsoutleave() != null ) {
            attEndanceRecordDTO.setIsoutleave( entity.getIsoutleave() );
        }
        if ( entity.getDksjqd() != null ) {
            attEndanceRecordDTO.setDksjqd( entity.getDksjqd() );
        }
        if ( entity.getAttendancerecordname() != null ) {
            attEndanceRecordDTO.setAttendancerecordname( entity.getAttendancerecordname() );
        }
        if ( entity.getPimpersonid() != null ) {
            attEndanceRecordDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmbmkqdzid() != null ) {
            attEndanceRecordDTO.setOrmbmkqdzid( entity.getOrmbmkqdzid() );
        }
        if ( entity.getAttendancemreportid() != null ) {
            attEndanceRecordDTO.setAttendancemreportid( entity.getAttendancemreportid() );
        }
        if ( entity.getTrmtrainplantermid() != null ) {
            attEndanceRecordDTO.setTrmtrainplantermid( entity.getTrmtrainplantermid() );
        }
        if ( entity.getCreatedate() != null ) {
            attEndanceRecordDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrgid() != null ) {
            attEndanceRecordDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getEnable() != null ) {
            attEndanceRecordDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreateman() != null ) {
            attEndanceRecordDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            attEndanceRecordDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getAttendancerecordid() != null ) {
            attEndanceRecordDTO.setAttendancerecordid( entity.getAttendancerecordid() );
        }
        if ( entity.getUpdateman() != null ) {
            attEndanceRecordDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getOrgsectorid() != null ) {
            attEndanceRecordDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getPimpersonname() != null ) {
            attEndanceRecordDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            attEndanceRecordDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getYgbh() != null ) {
            attEndanceRecordDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            attEndanceRecordDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getTrmtrainplantermname() != null ) {
            attEndanceRecordDTO.setTrmtrainplantermname( entity.getTrmtrainplantermname() );
        }
        if ( entity.getOrmbmkqdzname() != null ) {
            attEndanceRecordDTO.setOrmbmkqdzname( entity.getOrmbmkqdzname() );
        }
        if ( entity.getZzdzs() != null ) {
            attEndanceRecordDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getZjhm() != null ) {
            attEndanceRecordDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getOrmorgid() != null ) {
            attEndanceRecordDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getAttendancemreportmxname() != null ) {
            attEndanceRecordDTO.setAttendancemreportmxname( entity.getAttendancemreportmxname() );
        }
        if ( entity.getOrmorgname() != null ) {
            attEndanceRecordDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return attEndanceRecordDTO;
    }

    @Override
    public List<AttEndanceRecord> toDomain(List<AttEndanceRecordDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttEndanceRecord> list = new ArrayList<AttEndanceRecord>( dtoList.size() );
        for ( AttEndanceRecordDTO attEndanceRecordDTO : dtoList ) {
            list.add( toDomain( attEndanceRecordDTO ) );
        }

        return list;
    }

    @Override
    public List<AttEndanceRecordDTO> toDto(List<AttEndanceRecord> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttEndanceRecordDTO> list = new ArrayList<AttEndanceRecordDTO>( entityList.size() );
        for ( AttEndanceRecord attEndanceRecord : entityList ) {
            list.add( toDto( attEndanceRecord ) );
        }

        return list;
    }
}
