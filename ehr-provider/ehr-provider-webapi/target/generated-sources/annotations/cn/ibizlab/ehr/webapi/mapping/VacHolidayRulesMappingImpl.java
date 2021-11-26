package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.vac.domain.VacHolidayRules;
import cn.ibizlab.ehr.webapi.dto.VacHolidayRulesDTO;
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
public class VacHolidayRulesMappingImpl implements VacHolidayRulesMapping {

    @Override
    public VacHolidayRules toDomain(VacHolidayRulesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        VacHolidayRules vacHolidayRules = new VacHolidayRules();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            vacHolidayRules.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            vacHolidayRules.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSbsj() != null ) {
            vacHolidayRules.setSbsj( dto.getSbsj() );
        }
        if ( dto.getXbsj() != null ) {
            vacHolidayRules.setXbsj( dto.getXbsj() );
        }
        if ( dto.getNd() != null ) {
            vacHolidayRules.setNd( dto.getNd() );
        }
        if ( dto.getVacholidayrulesname() != null ) {
            vacHolidayRules.setVacholidayrulesname( dto.getVacholidayrulesname() );
        }
        if ( dto.getSfqy() != null ) {
            vacHolidayRules.setSfqy( dto.getSfqy() );
        }
        if ( dto.getTszxjzz() != null ) {
            vacHolidayRules.setTszxjzz( dto.getTszxjzz() );
        }
        if ( dto.getDefaultrule() != null ) {
            vacHolidayRules.setDefaultrule( dto.getDefaultrule() );
        }
        if ( dto.getOrmorgid() != null ) {
            vacHolidayRules.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            vacHolidayRules.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            vacHolidayRules.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getVacholidayrulesid() != null ) {
            vacHolidayRules.setVacholidayrulesid( dto.getVacholidayrulesid() );
        }
        if ( dto.getOrgid() != null ) {
            vacHolidayRules.setOrgid( dto.getOrgid() );
        }
        if ( dto.getCreatedate() != null ) {
            vacHolidayRules.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            vacHolidayRules.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrgcode() != null ) {
            vacHolidayRules.setOrgcode( dto.getOrgcode() );
        }
        if ( dto.getOrmorgname() != null ) {
            vacHolidayRules.setOrmorgname( dto.getOrmorgname() );
        }

        return vacHolidayRules;
    }

    @Override
    public VacHolidayRulesDTO toDto(VacHolidayRules entity) {
        if ( entity == null ) {
            return null;
        }

        VacHolidayRulesDTO vacHolidayRulesDTO = new VacHolidayRulesDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            vacHolidayRulesDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            vacHolidayRulesDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSbsj() != null ) {
            vacHolidayRulesDTO.setSbsj( entity.getSbsj() );
        }
        if ( entity.getXbsj() != null ) {
            vacHolidayRulesDTO.setXbsj( entity.getXbsj() );
        }
        if ( entity.getNd() != null ) {
            vacHolidayRulesDTO.setNd( entity.getNd() );
        }
        if ( entity.getVacholidayrulesname() != null ) {
            vacHolidayRulesDTO.setVacholidayrulesname( entity.getVacholidayrulesname() );
        }
        if ( entity.getSfqy() != null ) {
            vacHolidayRulesDTO.setSfqy( entity.getSfqy() );
        }
        if ( entity.getTszxjzz() != null ) {
            vacHolidayRulesDTO.setTszxjzz( entity.getTszxjzz() );
        }
        if ( entity.getDefaultrule() != null ) {
            vacHolidayRulesDTO.setDefaultrule( entity.getDefaultrule() );
        }
        if ( entity.getOrmorgid() != null ) {
            vacHolidayRulesDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            vacHolidayRulesDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            vacHolidayRulesDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getVacholidayrulesid() != null ) {
            vacHolidayRulesDTO.setVacholidayrulesid( entity.getVacholidayrulesid() );
        }
        if ( entity.getOrgid() != null ) {
            vacHolidayRulesDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getCreatedate() != null ) {
            vacHolidayRulesDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            vacHolidayRulesDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrgcode() != null ) {
            vacHolidayRulesDTO.setOrgcode( entity.getOrgcode() );
        }
        if ( entity.getOrmorgname() != null ) {
            vacHolidayRulesDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return vacHolidayRulesDTO;
    }

    @Override
    public List<VacHolidayRules> toDomain(List<VacHolidayRulesDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<VacHolidayRules> list = new ArrayList<VacHolidayRules>( dtoList.size() );
        for ( VacHolidayRulesDTO vacHolidayRulesDTO : dtoList ) {
            list.add( toDomain( vacHolidayRulesDTO ) );
        }

        return list;
    }

    @Override
    public List<VacHolidayRulesDTO> toDto(List<VacHolidayRules> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<VacHolidayRulesDTO> list = new ArrayList<VacHolidayRulesDTO>( entityList.size() );
        for ( VacHolidayRules vacHolidayRules : entityList ) {
            list.add( toDto( vacHolidayRules ) );
        }

        return list;
    }
}
