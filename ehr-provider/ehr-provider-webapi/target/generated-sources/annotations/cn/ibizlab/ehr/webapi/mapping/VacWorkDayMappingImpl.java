package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacWorkDay;
import cn.ibizlab.ehr.webapi.dto.VacWorkDayDTO;
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
public class VacWorkDayMappingImpl implements VacWorkDayMapping {

    @Override
    public VacWorkDay toDomain(VacWorkDayDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacWorkDay vacWorkDay = new VacWorkDay();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacWorkDay.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacWorkDay.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getNd() != null ) {
            vacWorkDay.setNd( dto.getNd() );
        }
        if ( dto.getVacworkdayname() != null ) {
            vacWorkDay.setVacworkdayname( dto.getVacworkdayname() );
        }
        if ( dto.getBz() != null ) {
            vacWorkDay.setBz( dto.getBz() );
        }
        if ( dto.getJssj() != null ) {
            vacWorkDay.setJssj( dto.getJssj() );
        }
        if ( dto.getSbsj() != null ) {
            vacWorkDay.setSbsj( dto.getSbsj() );
        }
        if ( dto.getXbsj() != null ) {
            vacWorkDay.setXbsj( dto.getXbsj() );
        }
        if ( dto.getKssj() != null ) {
            vacWorkDay.setKssj( dto.getKssj() );
        }
        if ( dto.getVacworkdayid() != null ) {
            vacWorkDay.setVacworkdayid( dto.getVacworkdayid() );
        }
        if ( dto.getCreatedate() != null ) {
            vacWorkDay.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            vacWorkDay.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            vacWorkDay.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacWorkDay.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getEnable() != null ) {
            vacWorkDay.setEnable( dto.getEnable() );
        }

        return vacWorkDay;
    }

    @Override
    public VacWorkDayDTO toDto(VacWorkDay entity) {
        if ( entity == null ) {
            return null;
        }

        VacWorkDayDTO vacWorkDayDTO = new VacWorkDayDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacWorkDayDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacWorkDayDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getNd() != null ) {
            vacWorkDayDTO.setNd( entity.getNd() );
        }
        if ( entity.getVacworkdayname() != null ) {
            vacWorkDayDTO.setVacworkdayname( entity.getVacworkdayname() );
        }
        if ( entity.getBz() != null ) {
            vacWorkDayDTO.setBz( entity.getBz() );
        }
        if ( entity.getJssj() != null ) {
            vacWorkDayDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getSbsj() != null ) {
            vacWorkDayDTO.setSbsj( entity.getSbsj() );
        }
        if ( entity.getXbsj() != null ) {
            vacWorkDayDTO.setXbsj( entity.getXbsj() );
        }
        if ( entity.getKssj() != null ) {
            vacWorkDayDTO.setKssj( entity.getKssj() );
        }
        if ( entity.getVacworkdayid() != null ) {
            vacWorkDayDTO.setVacworkdayid( entity.getVacworkdayid() );
        }
        if ( entity.getCreatedate() != null ) {
            vacWorkDayDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            vacWorkDayDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            vacWorkDayDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacWorkDayDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getEnable() != null ) {
            vacWorkDayDTO.setEnable( entity.getEnable() );
        }

        return vacWorkDayDTO;
    }

    @Override
    public List<VacWorkDay> toDomain(List<VacWorkDayDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacWorkDay> list = new ArrayList<VacWorkDay>( dtoList.size() );
        for ( VacWorkDayDTO vacWorkDayDTO : dtoList ) {
            list.add( toDomain( vacWorkDayDTO ) );
        }

        return list;
    }

    @Override
    public List<VacWorkDayDTO> toDto(List<VacWorkDay> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacWorkDayDTO> list = new ArrayList<VacWorkDayDTO>( entityList.size() );
        for ( VacWorkDay vacWorkDay : entityList ) {
            list.add( toDto( vacWorkDay ) );
        }

        return list;
    }
}
