package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.att.domain.AttEndanceMreportmx;
import cn.ibizlab.ehr.webapi.dto.AttEndanceMreportmxDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class AttEndanceMreportmxMappingImpl implements AttEndanceMreportmxMapping {

    @Override
    public AttEndanceMreportmx toDomain(AttEndanceMreportmxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttEndanceMreportmx attEndanceMreportmx = new AttEndanceMreportmx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            attEndanceMreportmx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            attEndanceMreportmx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getDay14() != null ) {
            attEndanceMreportmx.setDay14( dto.getDay14() );
        }
        if ( dto.getDay10() != null ) {
            attEndanceMreportmx.setDay10( dto.getDay10() );
        }
        if ( dto.getDay8() != null ) {
            attEndanceMreportmx.setDay8( dto.getDay8() );
        }
        if ( dto.getDay2() != null ) {
            attEndanceMreportmx.setDay2( dto.getDay2() );
        }
        if ( dto.getYf() != null ) {
            attEndanceMreportmx.setYf( dto.getYf() );
        }
        if ( dto.getDay30() != null ) {
            attEndanceMreportmx.setDay30( dto.getDay30() );
        }
        if ( dto.getDay27() != null ) {
            attEndanceMreportmx.setDay27( dto.getDay27() );
        }
        if ( dto.getDay1() != null ) {
            attEndanceMreportmx.setDay1( dto.getDay1() );
        }
        if ( dto.getDay7() != null ) {
            attEndanceMreportmx.setDay7( dto.getDay7() );
        }
        if ( dto.getDay24() != null ) {
            attEndanceMreportmx.setDay24( dto.getDay24() );
        }
        if ( dto.getDay13() != null ) {
            attEndanceMreportmx.setDay13( dto.getDay13() );
        }
        if ( dto.getDay3() != null ) {
            attEndanceMreportmx.setDay3( dto.getDay3() );
        }
        if ( dto.getAttendancemreportname() != null ) {
            attEndanceMreportmx.setAttendancemreportname( dto.getAttendancemreportname() );
        }
        if ( dto.getOrmrogname() != null ) {
            attEndanceMreportmx.setOrmrogname( dto.getOrmrogname() );
        }
        if ( dto.getDay11() != null ) {
            attEndanceMreportmx.setDay11( dto.getDay11() );
        }
        if ( dto.getDay29() != null ) {
            attEndanceMreportmx.setDay29( dto.getDay29() );
        }
        if ( dto.getDay4() != null ) {
            attEndanceMreportmx.setDay4( dto.getDay4() );
        }
        if ( dto.getDay17() != null ) {
            attEndanceMreportmx.setDay17( dto.getDay17() );
        }
        if ( dto.getDay16() != null ) {
            attEndanceMreportmx.setDay16( dto.getDay16() );
        }
        if ( dto.getOrmrogsectorid() != null ) {
            attEndanceMreportmx.setOrmrogsectorid( dto.getOrmrogsectorid() );
        }
        if ( dto.getDay5() != null ) {
            attEndanceMreportmx.setDay5( dto.getDay5() );
        }
        if ( dto.getNd() != null ) {
            attEndanceMreportmx.setNd( dto.getNd() );
        }
        if ( dto.getDay28() != null ) {
            attEndanceMreportmx.setDay28( dto.getDay28() );
        }
        if ( dto.getDay31() != null ) {
            attEndanceMreportmx.setDay31( dto.getDay31() );
        }
        if ( dto.getOrmrogsectorname() != null ) {
            attEndanceMreportmx.setOrmrogsectorname( dto.getOrmrogsectorname() );
        }
        if ( dto.getDay23() != null ) {
            attEndanceMreportmx.setDay23( dto.getDay23() );
        }
        if ( dto.getDay21() != null ) {
            attEndanceMreportmx.setDay21( dto.getDay21() );
        }
        if ( dto.getDay9() != null ) {
            attEndanceMreportmx.setDay9( dto.getDay9() );
        }
        if ( dto.getDay20() != null ) {
            attEndanceMreportmx.setDay20( dto.getDay20() );
        }
        if ( dto.getDay22() != null ) {
            attEndanceMreportmx.setDay22( dto.getDay22() );
        }
        if ( dto.getOrmrogid() != null ) {
            attEndanceMreportmx.setOrmrogid( dto.getOrmrogid() );
        }
        if ( dto.getDay26() != null ) {
            attEndanceMreportmx.setDay26( dto.getDay26() );
        }
        if ( dto.getKqhz() != null ) {
            attEndanceMreportmx.setKqhz( dto.getKqhz() );
        }
        if ( dto.getDay6() != null ) {
            attEndanceMreportmx.setDay6( dto.getDay6() );
        }
        if ( dto.getDay25() != null ) {
            attEndanceMreportmx.setDay25( dto.getDay25() );
        }
        if ( dto.getDay18() != null ) {
            attEndanceMreportmx.setDay18( dto.getDay18() );
        }
        if ( dto.getDay19() != null ) {
            attEndanceMreportmx.setDay19( dto.getDay19() );
        }
        if ( dto.getDay12() != null ) {
            attEndanceMreportmx.setDay12( dto.getDay12() );
        }
        if ( dto.getDay15() != null ) {
            attEndanceMreportmx.setDay15( dto.getDay15() );
        }
        if ( dto.getAttendencesetupid() != null ) {
            attEndanceMreportmx.setAttendencesetupid( dto.getAttendencesetupid() );
        }
        if ( dto.getAttendancemreportid2() != null ) {
            attEndanceMreportmx.setAttendancemreportid2( dto.getAttendancemreportid2() );
        }
        if ( dto.getPimpersonid() != null ) {
            attEndanceMreportmx.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreateman() != null ) {
            attEndanceMreportmx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            attEndanceMreportmx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getAttendancemreportmxid() != null ) {
            attEndanceMreportmx.setAttendancemreportmxid( dto.getAttendancemreportmxid() );
        }
        if ( dto.getCreatedate() != null ) {
            attEndanceMreportmx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            attEndanceMreportmx.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getYgbh() != null ) {
            attEndanceMreportmx.setYgbh( dto.getYgbh() );
        }
        if ( dto.getBm() != null ) {
            attEndanceMreportmx.setBm( dto.getBm() );
        }
        if ( dto.getPimpersonname() != null ) {
            attEndanceMreportmx.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getGw() != null ) {
            attEndanceMreportmx.setGw( dto.getGw() );
        }

        return attEndanceMreportmx;
    }

    @Override
    public AttEndanceMreportmxDTO toDto(AttEndanceMreportmx entity) {
        if ( entity == null ) {
            return null;
        }

        AttEndanceMreportmxDTO attEndanceMreportmxDTO = new AttEndanceMreportmxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            attEndanceMreportmxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            attEndanceMreportmxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getDay14() != null ) {
            attEndanceMreportmxDTO.setDay14( entity.getDay14() );
        }
        if ( entity.getDay10() != null ) {
            attEndanceMreportmxDTO.setDay10( entity.getDay10() );
        }
        if ( entity.getDay8() != null ) {
            attEndanceMreportmxDTO.setDay8( entity.getDay8() );
        }
        if ( entity.getDay2() != null ) {
            attEndanceMreportmxDTO.setDay2( entity.getDay2() );
        }
        if ( entity.getYf() != null ) {
            attEndanceMreportmxDTO.setYf( entity.getYf() );
        }
        if ( entity.getDay30() != null ) {
            attEndanceMreportmxDTO.setDay30( entity.getDay30() );
        }
        if ( entity.getDay27() != null ) {
            attEndanceMreportmxDTO.setDay27( entity.getDay27() );
        }
        if ( entity.getDay1() != null ) {
            attEndanceMreportmxDTO.setDay1( entity.getDay1() );
        }
        if ( entity.getDay7() != null ) {
            attEndanceMreportmxDTO.setDay7( entity.getDay7() );
        }
        if ( entity.getDay24() != null ) {
            attEndanceMreportmxDTO.setDay24( entity.getDay24() );
        }
        if ( entity.getDay13() != null ) {
            attEndanceMreportmxDTO.setDay13( entity.getDay13() );
        }
        if ( entity.getDay3() != null ) {
            attEndanceMreportmxDTO.setDay3( entity.getDay3() );
        }
        if ( entity.getAttendancemreportname() != null ) {
            attEndanceMreportmxDTO.setAttendancemreportname( entity.getAttendancemreportname() );
        }
        if ( entity.getOrmrogname() != null ) {
            attEndanceMreportmxDTO.setOrmrogname( entity.getOrmrogname() );
        }
        if ( entity.getDay11() != null ) {
            attEndanceMreportmxDTO.setDay11( entity.getDay11() );
        }
        if ( entity.getDay29() != null ) {
            attEndanceMreportmxDTO.setDay29( entity.getDay29() );
        }
        if ( entity.getDay4() != null ) {
            attEndanceMreportmxDTO.setDay4( entity.getDay4() );
        }
        if ( entity.getDay17() != null ) {
            attEndanceMreportmxDTO.setDay17( entity.getDay17() );
        }
        if ( entity.getDay16() != null ) {
            attEndanceMreportmxDTO.setDay16( entity.getDay16() );
        }
        if ( entity.getOrmrogsectorid() != null ) {
            attEndanceMreportmxDTO.setOrmrogsectorid( entity.getOrmrogsectorid() );
        }
        if ( entity.getDay5() != null ) {
            attEndanceMreportmxDTO.setDay5( entity.getDay5() );
        }
        if ( entity.getNd() != null ) {
            attEndanceMreportmxDTO.setNd( entity.getNd() );
        }
        if ( entity.getDay28() != null ) {
            attEndanceMreportmxDTO.setDay28( entity.getDay28() );
        }
        if ( entity.getDay31() != null ) {
            attEndanceMreportmxDTO.setDay31( entity.getDay31() );
        }
        if ( entity.getOrmrogsectorname() != null ) {
            attEndanceMreportmxDTO.setOrmrogsectorname( entity.getOrmrogsectorname() );
        }
        if ( entity.getDay23() != null ) {
            attEndanceMreportmxDTO.setDay23( entity.getDay23() );
        }
        if ( entity.getDay21() != null ) {
            attEndanceMreportmxDTO.setDay21( entity.getDay21() );
        }
        if ( entity.getDay9() != null ) {
            attEndanceMreportmxDTO.setDay9( entity.getDay9() );
        }
        if ( entity.getDay20() != null ) {
            attEndanceMreportmxDTO.setDay20( entity.getDay20() );
        }
        if ( entity.getDay22() != null ) {
            attEndanceMreportmxDTO.setDay22( entity.getDay22() );
        }
        if ( entity.getOrmrogid() != null ) {
            attEndanceMreportmxDTO.setOrmrogid( entity.getOrmrogid() );
        }
        if ( entity.getDay26() != null ) {
            attEndanceMreportmxDTO.setDay26( entity.getDay26() );
        }
        if ( entity.getKqhz() != null ) {
            attEndanceMreportmxDTO.setKqhz( entity.getKqhz() );
        }
        if ( entity.getDay6() != null ) {
            attEndanceMreportmxDTO.setDay6( entity.getDay6() );
        }
        if ( entity.getDay25() != null ) {
            attEndanceMreportmxDTO.setDay25( entity.getDay25() );
        }
        if ( entity.getDay18() != null ) {
            attEndanceMreportmxDTO.setDay18( entity.getDay18() );
        }
        if ( entity.getDay19() != null ) {
            attEndanceMreportmxDTO.setDay19( entity.getDay19() );
        }
        if ( entity.getDay12() != null ) {
            attEndanceMreportmxDTO.setDay12( entity.getDay12() );
        }
        if ( entity.getDay15() != null ) {
            attEndanceMreportmxDTO.setDay15( entity.getDay15() );
        }
        if ( entity.getAttendencesetupid() != null ) {
            attEndanceMreportmxDTO.setAttendencesetupid( entity.getAttendencesetupid() );
        }
        if ( entity.getAttendancemreportid2() != null ) {
            attEndanceMreportmxDTO.setAttendancemreportid2( entity.getAttendancemreportid2() );
        }
        if ( entity.getPimpersonid() != null ) {
            attEndanceMreportmxDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreateman() != null ) {
            attEndanceMreportmxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            attEndanceMreportmxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getAttendancemreportmxid() != null ) {
            attEndanceMreportmxDTO.setAttendancemreportmxid( entity.getAttendancemreportmxid() );
        }
        if ( entity.getCreatedate() != null ) {
            attEndanceMreportmxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            attEndanceMreportmxDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getYgbh() != null ) {
            attEndanceMreportmxDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getBm() != null ) {
            attEndanceMreportmxDTO.setBm( entity.getBm() );
        }
        if ( entity.getPimpersonname() != null ) {
            attEndanceMreportmxDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getGw() != null ) {
            attEndanceMreportmxDTO.setGw( entity.getGw() );
        }

        return attEndanceMreportmxDTO;
    }

    @Override
    public List<AttEndanceMreportmx> toDomain(List<AttEndanceMreportmxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttEndanceMreportmx> list = new ArrayList<AttEndanceMreportmx>( dtoList.size() );
        for ( AttEndanceMreportmxDTO attEndanceMreportmxDTO : dtoList ) {
            list.add( toDomain( attEndanceMreportmxDTO ) );
        }

        return list;
    }

    @Override
    public List<AttEndanceMreportmxDTO> toDto(List<AttEndanceMreportmx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttEndanceMreportmxDTO> list = new ArrayList<AttEndanceMreportmxDTO>( entityList.size() );
        for ( AttEndanceMreportmx attEndanceMreportmx : entityList ) {
            list.add( toDto( attEndanceMreportmx ) );
        }

        return list;
    }
}
