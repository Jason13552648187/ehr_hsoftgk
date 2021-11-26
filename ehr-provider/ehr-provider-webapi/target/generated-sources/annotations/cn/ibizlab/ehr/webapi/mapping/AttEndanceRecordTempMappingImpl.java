package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.att.domain.AttEndanceRecordTemp;
import cn.ibizlab.ehr.webapi.dto.AttEndanceRecordTempDTO;
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
public class AttEndanceRecordTempMappingImpl implements AttEndanceRecordTempMapping {

    @Override
    public AttEndanceRecordTemp toDomain(AttEndanceRecordTempDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttEndanceRecordTemp attEndanceRecordTemp = new AttEndanceRecordTemp();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            attEndanceRecordTemp.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            attEndanceRecordTemp.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getKqlx() != null ) {
            attEndanceRecordTemp.setKqlx( dto.getKqlx() );
        }
        if ( dto.getDksjqt() != null ) {
            attEndanceRecordTemp.setDksjqt( dto.getDksjqt() );
        }
        if ( dto.getZtf() != null ) {
            attEndanceRecordTemp.setZtf( dto.getZtf() );
        }
        if ( dto.getCdf() != null ) {
            attEndanceRecordTemp.setCdf( dto.getCdf() );
        }
        if ( dto.getSbsj() != null ) {
            attEndanceRecordTemp.setSbsj( dto.getSbsj() );
        }
        if ( dto.getOrmbmkqdzid() != null ) {
            attEndanceRecordTemp.setOrmbmkqdzid( dto.getOrmbmkqdzid() );
        }
        if ( dto.getYf() != null ) {
            attEndanceRecordTemp.setYf( dto.getYf() );
        }
        if ( dto.getXbsj() != null ) {
            attEndanceRecordTemp.setXbsj( dto.getXbsj() );
        }
        if ( dto.getDay() != null ) {
            attEndanceRecordTemp.setDay( dto.getDay() );
        }
        if ( dto.getAttendancerecordtempname() != null ) {
            attEndanceRecordTemp.setAttendancerecordtempname( dto.getAttendancerecordtempname() );
        }
        if ( dto.getIsweekend() != null ) {
            attEndanceRecordTemp.setIsweekend( dto.getIsweekend() );
        }
        if ( dto.getIsoutleave() != null ) {
            attEndanceRecordTemp.setIsoutleave( dto.getIsoutleave() );
        }
        if ( dto.getDksjqd() != null ) {
            attEndanceRecordTemp.setDksjqd( dto.getDksjqd() );
        }
        if ( dto.getIsoutoffice() != null ) {
            attEndanceRecordTemp.setIsoutoffice( dto.getIsoutoffice() );
        }
        if ( dto.getRshd() != null ) {
            attEndanceRecordTemp.setRshd( dto.getRshd() );
        }
        if ( dto.getKqrq() != null ) {
            attEndanceRecordTemp.setKqrq( dto.getKqrq() );
        }
        if ( dto.getNd() != null ) {
            attEndanceRecordTemp.setNd( dto.getNd() );
        }
        if ( dto.getPimpersonname() != null ) {
            attEndanceRecordTemp.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getYgbh() != null ) {
            attEndanceRecordTemp.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmorgid() != null ) {
            attEndanceRecordTemp.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPimpersonid() != null ) {
            attEndanceRecordTemp.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            attEndanceRecordTemp.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getAttendancerecordtempid() != null ) {
            attEndanceRecordTemp.setAttendancerecordtempid( dto.getAttendancerecordtempid() );
        }
        if ( dto.getEnable() != null ) {
            attEndanceRecordTemp.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            attEndanceRecordTemp.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            attEndanceRecordTemp.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            attEndanceRecordTemp.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            attEndanceRecordTemp.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            attEndanceRecordTemp.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getOrmorgname() != null ) {
            attEndanceRecordTemp.setOrmorgname( dto.getOrmorgname() );
        }

        return attEndanceRecordTemp;
    }

    @Override
    public AttEndanceRecordTempDTO toDto(AttEndanceRecordTemp entity) {
        if ( entity == null ) {
            return null;
        }

        AttEndanceRecordTempDTO attEndanceRecordTempDTO = new AttEndanceRecordTempDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            attEndanceRecordTempDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            attEndanceRecordTempDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getKqlx() != null ) {
            attEndanceRecordTempDTO.setKqlx( entity.getKqlx() );
        }
        if ( entity.getDksjqt() != null ) {
            attEndanceRecordTempDTO.setDksjqt( entity.getDksjqt() );
        }
        if ( entity.getZtf() != null ) {
            attEndanceRecordTempDTO.setZtf( entity.getZtf() );
        }
        if ( entity.getCdf() != null ) {
            attEndanceRecordTempDTO.setCdf( entity.getCdf() );
        }
        if ( entity.getSbsj() != null ) {
            attEndanceRecordTempDTO.setSbsj( entity.getSbsj() );
        }
        if ( entity.getOrmbmkqdzid() != null ) {
            attEndanceRecordTempDTO.setOrmbmkqdzid( entity.getOrmbmkqdzid() );
        }
        if ( entity.getYf() != null ) {
            attEndanceRecordTempDTO.setYf( entity.getYf() );
        }
        if ( entity.getXbsj() != null ) {
            attEndanceRecordTempDTO.setXbsj( entity.getXbsj() );
        }
        if ( entity.getDay() != null ) {
            attEndanceRecordTempDTO.setDay( entity.getDay() );
        }
        if ( entity.getAttendancerecordtempname() != null ) {
            attEndanceRecordTempDTO.setAttendancerecordtempname( entity.getAttendancerecordtempname() );
        }
        if ( entity.getIsweekend() != null ) {
            attEndanceRecordTempDTO.setIsweekend( entity.getIsweekend() );
        }
        if ( entity.getIsoutleave() != null ) {
            attEndanceRecordTempDTO.setIsoutleave( entity.getIsoutleave() );
        }
        if ( entity.getDksjqd() != null ) {
            attEndanceRecordTempDTO.setDksjqd( entity.getDksjqd() );
        }
        if ( entity.getIsoutoffice() != null ) {
            attEndanceRecordTempDTO.setIsoutoffice( entity.getIsoutoffice() );
        }
        if ( entity.getRshd() != null ) {
            attEndanceRecordTempDTO.setRshd( entity.getRshd() );
        }
        if ( entity.getKqrq() != null ) {
            attEndanceRecordTempDTO.setKqrq( entity.getKqrq() );
        }
        if ( entity.getNd() != null ) {
            attEndanceRecordTempDTO.setNd( entity.getNd() );
        }
        if ( entity.getPimpersonname() != null ) {
            attEndanceRecordTempDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getYgbh() != null ) {
            attEndanceRecordTempDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmorgid() != null ) {
            attEndanceRecordTempDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPimpersonid() != null ) {
            attEndanceRecordTempDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            attEndanceRecordTempDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getAttendancerecordtempid() != null ) {
            attEndanceRecordTempDTO.setAttendancerecordtempid( entity.getAttendancerecordtempid() );
        }
        if ( entity.getEnable() != null ) {
            attEndanceRecordTempDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            attEndanceRecordTempDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            attEndanceRecordTempDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            attEndanceRecordTempDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            attEndanceRecordTempDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            attEndanceRecordTempDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getOrmorgname() != null ) {
            attEndanceRecordTempDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return attEndanceRecordTempDTO;
    }

    @Override
    public List<AttEndanceRecordTemp> toDomain(List<AttEndanceRecordTempDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttEndanceRecordTemp> list = new ArrayList<AttEndanceRecordTemp>( dtoList.size() );
        for ( AttEndanceRecordTempDTO attEndanceRecordTempDTO : dtoList ) {
            list.add( toDomain( attEndanceRecordTempDTO ) );
        }

        return list;
    }

    @Override
    public List<AttEndanceRecordTempDTO> toDto(List<AttEndanceRecordTemp> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttEndanceRecordTempDTO> list = new ArrayList<AttEndanceRecordTempDTO>( entityList.size() );
        for ( AttEndanceRecordTemp attEndanceRecordTemp : entityList ) {
            list.add( toDto( attEndanceRecordTemp ) );
        }

        return list;
    }
}
